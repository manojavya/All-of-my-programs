#include <QApplication>
#include <QPushButton>
int main(int argc, char *argv[]){
    QApplication app(argc, argv);
    QWidget mainframe;
    mainframe.resize(700, 500);
    mainframe.setWindowTitle("Hello World!");
    QPushButton button("Hello World!", &mainframe);
    button.move(10, 50);
    QObject::connect(&button , &QPushButton::clicked, [] (){
        exit(0);
    });
    mainframe.show();
    return app.exec();
}