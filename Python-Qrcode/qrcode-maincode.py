import qrcode
data = input("Please enter the data to be encoded in the form of a qr code: ")
img = qrcode.make(data)
img.save("my_qrcode.png")
print("The qrcode has been saved in my_qrcode.png, go to the folder where this app was executed and then see the result")
