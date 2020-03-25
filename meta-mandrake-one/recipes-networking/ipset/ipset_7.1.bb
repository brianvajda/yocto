# Copyright (C) 2017 Aaron Brice <aaron.brice@datasoft.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Administration tool for IP sets"
HOMEPAGE = "http://ipset.netfilter.org"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"
SECTION = "base"

DEPENDS = "libtool libmnl"
RDEPENDS_${PN} = "kernel-module-ip-set"

SRC_URI = "http://ftp.netfilter.org/pub/ipset/${PN}-${PV}.tar.bz2"

SRC_URI[md5sum] = "72b477d1ce076d681b0799f88280f2f3"
SRC_URI[sha256sum] = "7b5eb3b93205c20cdc39e3fc8b6e5f7bb214bf79a7c0c00729dd4a31ce16adc4"

inherit autotools pkgconfig module-base

EXTRA_OECONF += "-with-kbuild=${KBUILD_OUTPUT} --with-ksource=${STAGING_KERNEL_DIR}"
