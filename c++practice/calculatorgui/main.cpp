#include "main.h"
#include "./ui_main.h"
#include <QApplication>

main::main(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::main)
{
    ui->setupUi(this);
}

main::~main()
{
    delete ui;
}
