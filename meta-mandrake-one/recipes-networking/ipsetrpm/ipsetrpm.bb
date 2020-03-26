DESCRIPTION = "Install RPM"

LICENSE = "CLOSED"

SRC_URI += " \
	file://ipset.dummy \
	file://intIpset.sh \
"

do_install() {
   install -d ${D}/home/temp/
   install -m 755 ${WORKDIR}/ipset.dummy ${D}/home/temp/
   install -m 755 ${WORKDIR}/intIpset.sh ${D}/home/temp/
}

FILES_${PN} += "\
	/home/temp/ipset.dummy \
	/home/temp/intIpset.sh \
"
