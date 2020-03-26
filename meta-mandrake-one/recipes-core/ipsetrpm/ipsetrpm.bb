DESCRIPTION = "Install RPM"
#To prevent the LICENSE field not set
LICENSE = "CLOSED"

SRC_URI = "file://ipset-7.1.o"
#SRC_URI = "file://ipset-7.1-r0.lx2160ardb.tar.xz"
#SRC_URI = "file://ipset-7.1-r0.lx2160ardb.rpm"

S = "${WORKDIR}"

do_install() {
	install -d ${D}/home/temp/
        #cp ${WORKDIR}/ipset-7.1-r0.lx2160ardb.rpm ${D}/home/temp
        install -m 755 ${WORKDIR}/ipset-7.1.o ${D}/home/temp/
}

FILES_${PN} += "/home/temp/ipset-7.1.o"