SUMMARY = "Python bindings for the Cairo canvas library"
HOMEPAGE = "http://cairographics.org/pycairo"
BUGTRACKER = "http://bugs.freedesktop.org"
SECTION = "python-devel"
LICENSE = "LGPL-2.1-only & MPL-1.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=f3713ca2c28d9312ad718520b6dc3eee \
                    file://COPYING-LGPL-2.1;md5=fad9b3332be894bab9bc501572864b29 \
                    file://COPYING-MPL-1.1;md5=bfe1f75d606912a4111c90743d6c7325"

# cairo >= 1.14
DEPENDS = "cairo python3"

SRC_URI = "${GITHUB_BASE_URI}/download/v${PV}/pycairo-${PV}.tar.gz"
GITHUB_BASE_URI = "https://github.com/pygobject/pycairo/releases/"

SRC_URI[sha256sum] = "37842b9bfa6339c45a5025f752e1d78d5840b1a0f82303bdd5610846ad8b5c4f"

S = "${WORKDIR}/pycairo-${PV}"

inherit meson pkgconfig python3targetconfig github-releases

CFLAGS += "-fPIC"

BBCLASSEXTEND = "native"

FILES:${PN} = "${PYTHON_SITEPACKAGES_DIR}/*"
