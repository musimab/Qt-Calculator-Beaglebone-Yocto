
require calculator-image-minimal.bb

DESCRIPTION = "A small custom image just capable of allowing a device to boot and \
is suitable for development work."

IMAGE_FEATURES:append= " dbg-pkgs"
IMAGE_FEATURES:append= " debug-tweaks"