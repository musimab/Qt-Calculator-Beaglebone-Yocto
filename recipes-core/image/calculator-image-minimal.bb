SUMMARY = "A small custom image just capable of allowing a device to boot."

IMAGE_INSTALL:append =" packagegroup-core-boot"
IMAGE_INSTALL:append =" packagegroup-calculator-qtapp"
IMAGE_INSTALL:append =" packagegroup-core-ssh-openssh"


IMAGE_FSTYPES = "tar.xz ext3"

LICENSE = "MIT"

inherit core-image