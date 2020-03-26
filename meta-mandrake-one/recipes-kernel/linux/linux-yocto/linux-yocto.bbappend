FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# The defconfig comes from tmp/work/lx2160ardb-fsl-linux/linux-qoriq/4.19-r0/build/.config under build dir
SRC_URI += "file://defconfig"
