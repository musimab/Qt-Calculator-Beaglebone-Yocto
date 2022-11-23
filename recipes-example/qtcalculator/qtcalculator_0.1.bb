SUMMARY = "QT Example Recipe"
LICENSE = "CLOSED"

SRC_URI = "file://simpleCalculator.pro \
           file://mainwindow.cpp \
           file://main.cpp \
           file://mainwindow.ui \
           file://mainwindow.h"

DEPENDS += " qtbase"

inherit qmake5

S = "${WORKDIR}"

do_install () {
    install -d ${D}${bindir}
    install -m 0775 simpleCalculator ${D}${bindir}
}

