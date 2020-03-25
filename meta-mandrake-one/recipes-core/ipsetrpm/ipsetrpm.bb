DESCRIPTION = "Install RPM"
#To prevent the LICENSE field not set
LICENSE = "CLOSED"

SRC_URI = "file://ipset-7.1-r0.lx2160ardb.rpm"

S = "${WORKDIR}/files"

do_install() {
	install -d ${D}/home/rpm
        install -m 0644 ${WORKDIR}/ipset-7.1-r0.lx2160ardb.rpm ${D}/home/rpm/
}

FILES_${PN} += "/home/rpm"