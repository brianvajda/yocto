DESCRIPTION = "Modifies the network interfaces"

do_install_append () {
    echo $'auto eth1\niface eth1 inet dhcp' >> ${D}/etc/network/interfaces
}

