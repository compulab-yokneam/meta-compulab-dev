require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

SUMMARY = "CompuLab 4.9.11 kernel"
DESCRIPTION = "Linux kernel for CompuLab imx6 boards."

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "imx_4.9.11_1.0.0_ga"
SRCREV ?= "c27010d99a3d91703ea2d1a3f9630a9dedc3f86f"
LOCALVERSION = "-cl-2.0"

SRC_URI += "file://0001-platform-add-depends-property-handler.patch \
	file://0002-ARM-dts-update-support-for-cm-fx6.patch \
	file://0003-ARM-i.MX6-cm-fx6-add-cm-fx6-platform-driver.patch \
	file://0004-ARM-i.MX6-cm-fx6-Add-defconfig.patch \
	file://0005-ARM-i.MX6-cm-fx6-add-gpc-node.patch \
	file://0006-ARM-i.MX6-audio-add-analog-audio-support.patch \
	file://0007-ARM-i.MX6-add-depends-property-to-gpmi-nand.patch \
	file://0008-ARM-i.MX6-update-defconfig-for-nand.patch \
	file://0009-ARM-i.MX6-add-mxc_dvi-driver.patch \
	file://0010-ARM-i.MX6-dts-refactoring-of-the-second-video-output.patch \
	file://0011-ARM-i.MX6-dts-ldo-hdmi-changes.patch \
	file://0012-ARM-i.MX6-dts-udshc3-set-polarity-value.patch \
	file://0013-ARM-i.MX6-dts-sata-refactoring.patch \
	file://0014-ARM-i.MX6-dts-ldb-refactoring.patch \
	file://0015-ARM-i.MX6-dts-enable-mipi_dsi.patch \
	file://0016-ARM-i.MX6-pcie-refactoring.patch \
	file://0017-ARM-i.MX6-dts-clean-up-unnecesary-code.patch \
	file://0018-ARM-i.MX6-update-defconfig.patch \
	file://0019-Bluetooth-btmrvl-disable-SD8787-AMP-device.patch \
	file://0020-ARM-i.MX6-HDMI-Fix-HDMI-PHY-init-hang.patch \
	file://0021-ARM-i.MX6-dts-set-gpio-can-sleep-for-mipi_dsi_reset.patch \
	file://0022-ARM-i.MX6-dts-configure-all-mxc-UARTs.patch \
	file://0023-ARM-i.MX6-dts-add-hdmi-to-fb0-mapping-for-eval-board.patch \
	file://0024-ARM-i.MX6-dts-refactoring-hdmi-mipi-configuration.patch \
	file://0025-igb-Enable-random-mac-address.patch \
	file://0026-ARM-i.MX6-dts-add-sound-card-order.patch \
	file://0027-ARM-i.MX6-update-defconfig.patch \
	file://0028-ARM-i.MX6-update-defconfig-local-version.patch \
	file://0029-ARM-i.MX6-cm-fx6-disable-FSL-CAAM.patch \
	file://0030-ARM-i.MX6-Enable-MXC-Vivante-GPU-as-a-module.patch \
	file://0031-ARM-i.MX6-Disable-uart1-RX-DMA.patch \
	file://0032-ARM-i.MX6-dts-add-ov564x-mipi-camera-support.patch \
	file://0033-ARM-i.MX6-update-defconfig-with-OPTIMIZE_FOR_SIZE.patch \
	file://0034-ARM-i.MX6-dts-Add-initial-support-for-SOM-iMX6.patch \
	file://0035-ARM-i.MX6-cl-som-imx6-add-defconfig.patch \
	file://0036-ARM-i.MX6-cl-som-imx6-enable-fec-phy.patch \
	file://0037-ARM-i.MX6-cl-som-imx6-disable-mwifi.patch \
	file://0038-ARM-i.MX6-cl-som-imx6-enable-rtc-ABX80X.patch \
	file://0039-ARM-i.MX6-cl-som-imx6-enable-wifi-murata.patch \
	file://0040-ARM-i.MX6-cl-som-imx6-enable-bluetooth-murata.patch \
	file://0041-ARM-i.MX6-cl-som-imx6-dts-small-fixes.patch \
	file://0042-ARM-i.MX6-sb-fx6-1.2-add-kgdb-on-sw6-support.patch \
	file://0043-ARM-i.MX6-dts-add-memory-label.patch \
	file://0044-ARM-i.MX6qp-cl-som-imx6-add-imx6qp-init.patch \
	file://0045-ARM-i.MX6qp-cl-som-imx6-dts-add-i.MX6qp-dts.patch \
	file://0046-ARM-i.MX6-sbc-imx6-add-dvi-hdmi-default-frame-buffer.patch \
	file://0047-ARM-i.MX6-cl-som-imx6-disable-pwm3.patch \
	file://0048-ARM-i.MX6-cl-som-imx6-Add-emmc-support.patch \
	file://0049-ARM-i.MX6-cl-som-imx6-add-pendown-interrupt.patch \
	file://0050-ARM-i.MX6-cl-som-imx6-MX6_VPU_352M-y.patch \
	file://0051-igb-mac-address-from-dtb-blank-i211-to-get-handled.patch \
	file://0052-ARM-i.MX6-cl-som-imx6-defconfig-enable-USB_ACM.patch \
	file://0053-ARM-i.MX6-dts-fix-ldb-timings.patch \
	file://0054-ARM-i.MX6-dts-cl-som-imx6-add-mipi-to-fb0-mapping.patch \
	file://0055-ARM-i.MX6-cl-som-imx6-tag-kernel-version-cl-som-imx6.patch \
	file://0056-ARM-i.MX6-dts-fix-usdhc3-bus-settings.patch \
	file://0057-ARM-i.MX6-tvp5150-add-tvp5150-video-decoder-support.patch \
	file://0058-ARM-i.MX6-cm-fx6-dts-Add-parallel-camera-support.patch \
	file://0059-ARM-i.MX6-cm-fx6-defconfig-enable-tvp5150.patch \
	file://0060-ARM-i.MX6-cl-som-imx6-dts-Add-parallel-camera-suppor.patch \
	file://0061-ARM-i.MX6-cl-som-imx6-defconfig-enable-tvp5150.patch \
	file://0062-ARM-i.MX6-cm-fx6-defconfig-enable-POSIX_MQUEUE.patch \
	file://0063-ARM-i.MX6-cl-som-imx6-defconfig-enable-POSIX_MQUEUE.patch \
	file://0064-Fix-the-compile-issue-under-gcc6.patch \
	file://0065-ARM-i.MX6-dts-disable-tvp5150-by-default.patch \
	file://0066-ARM-i.MX6-cm-fx6-dts-tvp5150-to-enable-uart5-to-disa.patch \
	file://0067-ARM-i.MX6-cl-som-imx6-dts-tvp5150-to-enable-uart5-to.patch \
	file://0068-ARM-i.MX6-dts-enable-snvs_poweroff.patch \
	file://0069-ARM-i.MX6-cl-som-imx6-Update-defconfig-for-snvs_powe.patch \
	file://0070-ARM-i.MX6-cm-fx6-Update-defconfig-for-snvs_poweroff.patch \
	file://0071-ARM-i.MX6-cl-som-imx6-Update-defconfig-BCMDHD-y.patch \
	file://0072-ARM-i.MX6-cm-fx6-Update-defconfig-for-4.9.patch \
	file://0073-ARM-i.MX6-cl-som-imx6-Update-defconfig-for-4.9.patch \
	file://0074-ARM-i.MX6-cl-som-imx6-dts-Fix-QP-dts-i-include-order.patch \
	file://0075-ARM-i.MX6-sb-fx6-dts-Change-lvds-timing-field-name.patch \
	file://0076-ARM-i.MX6-dts-Add-extended-display-settings.patch \
	file://0077-ARM-i.MX6-dts-Add-available-mode-string.patch \
	file://0078-ARM-i.MX6-dts-Configure-the-parallel-interface-a-the.patch \
"

SRC_URI_append_cm-fx6-evk += "file://cm-fx6-evk/defconfig"

SRC_URI_append_cl-som-imx6 += "file://cl-som-imx6/defconfig"

COMPATIBLE_MACHINE = "(cm-fx6-evk|cl-som-imx6)"

inherit fsl-vivante-kernel-driver-handler

IMX_UAPI_HEADERS = "mxc_asrc.h mxc_dcic.h mxcfb.h mxc_mlb.h mxc_sim_interface.h \
                    mxc_v4l2.h ipu.h videodev2.h pxp_device.h pxp_dma.h isl29023.h"

do_install_append () {
   # Install i.MX specific uapi headers
   oe_runmake headers_install INSTALL_HDR_PATH=${B}${exec_prefix}
   install -d ${D}${exec_prefix}/include/linux
   for UAPI_HDR in ${IMX_UAPI_HEADERS}; do
       find ${B}${exec_prefix}/include -name ${UAPI_HDR} -exec cp {} ${D}${exec_prefix}/include/linux \;
       ls ${D}${exec_prefix}/include/linux
       echo "copy ${UAPI_HDR} done"
   done
}

PACKAGES += "linux-imx-soc-headers"
FILES_linux-imx-soc-headers = "${exec_prefix}/include"
