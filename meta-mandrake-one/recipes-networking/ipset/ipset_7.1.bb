# Copyright (C) 2017 Aaron Brice <aaron.brice@datasoft.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Administration tool for IP sets"
HOMEPAGE = "http://ipset.netfilter.org"
LICENSE = "CLOSED"
#LICENSE = "GPL-2.0"
#LIC_FILES_CHKSUM = "file://${WORKDIR}/COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"
SECTION = "base"
#BB_STRICT_CHECKSUM = "0"

DEPENDS = "libtool libmnl"
RDEPENDS_${PN} = "kernel-module-ip-set"



FILESEXTRAPATHS_prepend := "${THISDIR}:"
SRCREV = "ac5292c2c57f626f7918a48126858140da239755"
SRC_URI = "file://ipset-7.1.tar.gz"
#  	   git://git.netfilter.org/ipset.git;branch=master;protocol=git"

#SRC_URI[md5sum] = "0e5d9c85f6b78e7dff0c996e2900574b"
#SRC_URI[sha256sum] = "ceef625ba31fe0aaa422926c7231a819de0b07644c02c17ebdd3022a29e3e244"

inherit autotools pkgconfig module-base

EXTRA_OECONF += "-with-kbuild=${KBUILD_OUTPUT} --with-ksource=${STAGING_KERNEL_DIR}"
