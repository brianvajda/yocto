DESCRIPTION = "Network Configuration"
#To prevent the LICENSE field not set
LICENSE = "CLOSED"

SRC_URI = "file://interfaces"

S = "${WORKDIR}/files"

do_install() {
	install -d ${D}/etc/network
        install -m 0755 -d ${S}/interfaces ${WORKDIR}/etc/network/interfaces
}

FILES_${PN} += "/etc/network/interfaces"
