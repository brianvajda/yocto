DESCRIPTION = "Custom Kernel Modifications"

 

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# To change kernel config
# bitbake -c menuconfigconfig virtual/kernel
# bitbake -c savedefconfig virtual/kernel
# The defconfig comes from tmp/work/lx2160ardb-fsl-linux/linux-qoriq/4.19-r0/build/.config under build dir
SRC_URI += "file://defconfigk"