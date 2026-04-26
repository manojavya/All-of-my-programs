import org.lwjgl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class App {
    private long window;
    private float angle = 0.0f; // Rotation angle

    public void run() {
        init();
        loop();

        glfwFreeCallbacks(window);
        glfwDestroyWindow(window);
        glfwTerminate();
        glfwSetErrorCallback(null).free();
    }

    private void init() {
        GLFWErrorCallback.createPrint(System.err).set();

        if (!glfwInit())
            throw new IllegalStateException("Unable to initialize GLFW");

        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);

        window = glfwCreateWindow(800, 600, "IDK", NULL, NULL);
        if (window == NULL)
            throw new RuntimeException("Failed to create the GLFW window");

        glfwMakeContextCurrent(window);
        glfwSwapInterval(1);

        // Create OpenGL capabilities after making the context current
        GL.createCapabilities();

        glfwShowWindow(window);
    }

    private void loop() {
        // Set the clear color (background color)
        glClearColor(0.1f, 0.2f, 0.3f, 1.0f); // Dark blue background

        // Set up a perspective projection
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        float fov = 45.0f; // Field of view
        float aspectRatio = 800.0f / 600.0f; // Aspect ratio of the window
        float near = 0.1f; // Near clipping plane
        float far = 100.0f; // Far clipping plane

        // Calculate the frustum bounds
        float top = (float) Math.tan(Math.toRadians(fov / 2)) * near;
        float bottom = -top;
        float right = top * aspectRatio;
        float left = -right;

        // Set the perspective projection using glFrustum
        glFrustum(left, right, bottom, top, near, far);

        glMatrixMode(GL_MODELVIEW);
        glLoadIdentity();

        // Move the camera back so the object is visible
        glTranslatef(0.0f, 0.0f, -3.0f);

        while (!glfwWindowShouldClose(window)) {
            // Clear the framebuffer
            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

            // Enable depth testing for proper 3D rendering
            glEnable(GL_DEPTH_TEST);

            // Apply rotation
            glPushMatrix(); // Save the current transformation matrix
            glRotatef(angle, 0.0f, 1.0f, 0.0f); // Rotate around the Y-axis

            // Render a 3D triangle (pyramid-like shape)
            glBegin(GL_TRIANGLES);

            // Front face
            glColor3f(1.0f, 0.0f, 0.0f); // Red
            glVertex3f(0.0f, 0.5f, 0.0f); // Top
            glColor3f(0.0f, 1.0f, 0.0f); // Green
            glVertex3f(-0.5f, -0.5f, 0.5f); // Bottom-left
            glColor3f(0.0f, 0.0f, 1.0f); // Blue
            glVertex3f(0.5f, -0.5f, 0.5f); // Bottom-right

            // Right face
            glColor3f(1.0f, 0.0f, 0.0f); // Red
            glVertex3f(0.0f, 0.5f, 0.0f); // Top
            glColor3f(0.0f, 0.0f, 1.0f); // Blue
            glVertex3f(0.5f, -0.5f, 0.5f); // Bottom-left
            glColor3f(0.0f, 1.0f, 0.0f); // Green
            glVertex3f(0.5f, -0.5f, -0.5f); // Bottom-right

            // Back face
            glColor3f(1.0f, 0.0f, 0.0f); // Red
            glVertex3f(0.0f, 0.5f, 0.0f); // Top
            glColor3f(0.0f, 1.0f, 0.0f); // Green
            glVertex3f(0.5f, -0.5f, -0.5f); // Bottom-left
            glColor3f(0.0f, 0.0f, 1.0f); // Blue
            glVertex3f(-0.5f, -0.5f, -0.5f); // Bottom-right

            // Left face
            glColor3f(1.0f, 0.0f, 0.0f); // Red
            glVertex3f(0.0f, 0.5f, 0.0f); // Top
            glColor3f(0.0f, 0.0f, 1.0f); // Blue
            glVertex3f(-0.5f, -0.5f, -0.5f); // Bottom-left
            glColor3f(0.0f, 1.0f, 0.0f); // Green
            glVertex3f(-0.5f, -0.5f, 0.5f); // Bottom-right

            glEnd();

            glPopMatrix(); // Restore the transformation matrix

            // Increment the rotation angle
            angle += 0.5f; // Adjust the speed of rotation as needed

            // Swap the color buffers
            glfwSwapBuffers(window);

            // Poll for window events
            glfwPollEvents();
        }
    }

    public static void main(String[] args) {
        new App().run();
    }
}
