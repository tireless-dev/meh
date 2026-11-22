// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

val black = Color(0xff000000)
val gray100 = Color(0xff161616)
val gray90 = Color(0xff262626)
val gray90Hover = Color(0xff333333)
val gray80 = Color(0xff393939)
val gray80Hover = Color(0xff474747)
val gray70 = Color(0xff525252)
val gray70Hover = Color(0xff636363)
val gray60 = Color(0xff6f6f6f)
val gray60Hover = Color(0xff5e5e5e)
val gray50 = Color(0xff8d8d8d)
val gray50Hover = Color(0xff7a7a7a)
val gray40 = Color(0xffa8a8a8)
val gray30 = Color(0xffc6c6c6)
val gray20 = Color(0xffe0e0e0)
val gray20Hover = Color(0xffd1d1d1)
val gray10 = Color(0xfff4f4f4)
val gray10Hover = Color(0xffe8e8e8)
val coolGray100 = Color(0xff121619)
val coolGray70 = Color(0xff4d5358)
val coolGray70Hover = Color(0xff5d646a)
val coolGray50 = Color(0xff878d96)
val coolGray40 = Color(0xffa2a9b0)
val coolGray20 = Color(0xffdde1e6)
val coolGray20Hover = Color(0xffcdd3da)
val coolGray10 = Color(0xfff2f4f8)
val warmGray100 = Color(0xff171414)
val warmGray70 = Color(0xff565151)
val warmGray70Hover = Color(0xff696363)
val warmGray50 = Color(0xff8f8b8b)
val warmGray40 = Color(0xffada8a8)
val warmGray20 = Color(0xffe5e0df)
val warmGray20Hover = Color(0xffd8d0cf)
val warmGray10 = Color(0xfff7f3f2)
val white = Color(0xffffffff)
val red80 = Color(0xff750e13)
val red70 = Color(0xffa2191f)
val red70Hover = Color(0xffc21e25)
val red60 = Color(0xffda1e28)
val red50 = Color(0xfffa4d56)
val red40 = Color(0xffff8389)
val red30 = Color(0xffffb3b8)
val red20 = Color(0xffffd7d9)
val red20Hover = Color(0xffffc2c5)
val orange40 = Color(0xffff832b)
val green80 = Color(0xff044317)
val green70 = Color(0xff0e6027)
val green70Hover = Color(0xff11742f)
val green50 = Color(0xff24a148)
val green40 = Color(0xff42be65)
val green20 = Color(0xffa7f0ba)
val green20Hover = Color(0xff74e792)
val yellow30 = Color(0xfff1c21b)
val blue80 = Color(0xff002d9c)
val blue70 = Color(0xff0043ce)
val blue70Hover = Color(0xff0053ff)
val blue60 = Color(0xff0f62fe)
val blue60Hover = Color(0xff0050e6)
val blue50 = Color(0xff4589ff)
val blue40 = Color(0xff78a9ff)
val blue30 = Color(0xffa6c8ff)
val blue20 = Color(0xffd0e2ff)
val blue20Hover = Color(0xffb8d3ff)
val magenta20 = Color(0xffffd6e8)
val magenta20Hover = Color(0xffffbdda)
val magenta40 = Color(0xffff7eb6)
val magenta50 = Color(0xffee5396)
val magenta70 = Color(0xff9f1853)
val magenta70Hover = Color(0xffbf1d63)
val magenta80 = Color(0xff740937)
val purple20 = Color(0xffe8daff)
val purple20Hover = Color(0xffdcc7ff)
val purple40 = Color(0xffbe95ff)
val purple50 = Color(0xffa56eff)
val purple60 = Color(0xff8a3ffc)
val purple70 = Color(0xff6929c4)
val purple70Hover = Color(0xff7c3dd6)
val purple80 = Color(0xff491d8b)
val cyan20 = Color(0xffbae6ff)
val cyan20Hover = Color(0xff99daff)
val cyan40 = Color(0xff33b1ff)
val cyan50 = Color(0xff1192e8)
val cyan70 = Color(0xff00539a)
val cyan70Hover = Color(0xff0066bd)
val cyan80 = Color(0xff003a6d)
val teal20 = Color(0xff9ef0f0)
val teal20Hover = Color(0xff57e5e5)
val teal40 = Color(0xff08bdba)
val teal50 = Color(0xff009d9a)
val teal70 = Color(0xff005d5d)
val teal70Hover = Color(0xff007070)
val teal80 = Color(0xff004144)

@Immutable
interface Colors {
  // background
  val background: Color
  val backgroundHover: Color
  val backgroundActive: Color
  val backgroundSelected: Color
  val backgroundSelectedHover: Color
  val backgroundInverse: Color
  val backgroundInverseHover: Color
  val backgroundBrand: Color

  // layer
  val layer01: Color
  val layer01OnMap: Color
  val layerHover01: Color
  val layerActive01: Color
  val layerSelected01: Color
  val layerSelectedHover01: Color
  val layerBackground01: Color
  val layer02: Color
  val layer02OnMap: Color
  val layerHover02: Color
  val layerActive02: Color
  val layerSelected02: Color
  val layerSelectedHover02: Color
  val layerBackground02: Color
  val layer03: Color
  val layerHover03: Color
  val layerActive03: Color
  val layerSelected03: Color
  val layerSelectedHover03: Color
  val layerBackground03: Color
  val layerSelectedInverse: Color
  val layerSelectedDisabled: Color
  val layerAccent01: Color
  val layerAccentHover01: Color
  val layerAccentActive01: Color
  val layerAccent02: Color
  val layerAccentHover02: Color
  val layerAccentActive02: Color
  val layerAccent03: Color
  val layerAccentHover03: Color
  val layerAccentActive03: Color

  // field
  val field01: Color
  val fieldHover01: Color
  val field02: Color
  val fieldHover02: Color
  val field03: Color
  val fieldHover03: Color

  // border
  val borderInteractive: Color
  val borderSubtle00: Color
  val borderSubtle01: Color
  val borderSubtleSelected01: Color
  val borderSubtle02: Color
  val borderSubtleSelected02: Color
  val borderSubtle03: Color
  val borderSubtleSelected03: Color
  val borderInverse: Color
  val borderStrong01: Color
  val borderStrong02: Color
  val borderStrong03: Color
  val borderTile01: Color
  val borderTile02: Color
  val borderTile03: Color
  val borderDisabled: Color

  // text
  val textPrimary: Color
  val textSecondary: Color
  val textOnColor: Color
  val textOnColorDisabled: Color
  val textHelper: Color
  val textPlaceholder: Color
  val textError: Color
  val textInverse: Color
  val textDisabled: Color

  // link
  val linkPrimary: Color
  val linkPrimaryHover: Color
  val linkSecondary: Color
  val linkInverse: Color
  val linkInverseHover: Color
  val linkInverseActive: Color
  val linkInverseVisited: Color
  val linkVisited: Color

  // icon
  val iconPrimary: Color
  val iconSecondary: Color
  val iconInverse: Color
  val iconOnColor: Color
  val iconOnColorDisabled: Color
  val iconDisabled: Color
  val iconInteractive: Color

  // support
  val supportError: Color
  val supportSuccess: Color
  val supportWarning: Color
  val supportInfo: Color
  val supportErrorInverse: Color
  val supportSuccessInverse: Color
  val supportWarningInverse: Color
  val supportInfoInverse: Color
  val supportCautionMajor: Color
  val supportCautionMinor: Color
  val supportCautionUndefined: Color
  val supportAccent: Color

  // focus
  val focus: Color
  val focusInset: Color
  val focusInverse: Color

  // miscellaneous
  val interactive: Color
  val highlight: Color
  val toggleOff: Color
  val overlay: Color
  val shadow: Color
  val skeletonBackground: Color
  val skeletonElement: Color

  // button
  val buttonPrimary: Color
  val buttonPrimaryHover: Color
  val buttonPrimaryActive: Color
  val buttonSecondary: Color
  val buttonSecondaryHover: Color
  val buttonSecondaryActive: Color
  val buttonTertiary: Color
  val buttonTertiaryHover: Color
  val buttonTertiaryActive: Color
  val buttonDangerPrimary: Color
  val buttonDangerSecondary: Color
  val buttonDangerHover: Color
  val buttonDangerActive: Color
  val buttonSeparator: Color
  val buttonDisabled: Color

  // tags
  val tagGray: ColorPair
  val tagCoolGray: ColorPair
  val tagWarmGray: ColorPair
  val tagBlue: ColorPair
  val tagGreen: ColorPair
  val tagRed: ColorPair
  val tagMagenta: ColorPair
  val tagPurple: ColorPair
  val tagCyan: ColorPair
  val tagTeal: ColorPair
}

@Immutable
data class ColorPair(
  val background: Color,
  val text: Color,
  val hover: Color,
  val border: Color,
)

@Immutable
object WhiteColors : Colors {
  // background
  override val background = white
  override val backgroundHover = gray50.copy(alpha = 0.12f)
  override val backgroundActive = gray50.copy(alpha = 0.5f)
  override val backgroundSelected = gray50.copy(alpha = 0.2f)
  override val backgroundSelectedHover = gray50.copy(alpha = 0.32f)
  override val backgroundInverse = gray80
  override val backgroundInverseHover = gray80Hover
  override val backgroundBrand = blue60

  // layer
  override val layer01 = gray10
  override val layer01OnMap = gray10.copy(alpha = 0.9f)
  override val layerHover01 = gray10Hover
  override val layerActive01 = gray30
  override val layerSelected01 = gray20
  override val layerSelectedHover01 = gray20Hover
  override val layerBackground01 = white
  override val layer02 = white
  override val layer02OnMap = white.copy(alpha = 0.9f)
  override val layerHover02 = gray10Hover
  override val layerActive02 = gray30
  override val layerSelected02 = gray20
  override val layerSelectedHover02 = gray20Hover
  override val layerBackground02 = gray10
  override val layer03 = gray10
  override val layerHover03 = gray10Hover
  override val layerActive03 = gray30
  override val layerSelected03 = gray20
  override val layerSelectedHover03 = gray20Hover
  override val layerBackground03 = white
  override val layerSelectedInverse = gray100
  override val layerSelectedDisabled = gray50
  override val layerAccent01 = gray20
  override val layerAccentHover01 = gray20Hover
  override val layerAccentActive01 = gray40
  override val layerAccent02 = gray20
  override val layerAccentHover02 = gray20Hover
  override val layerAccentActive02 = gray40
  override val layerAccent03 = gray20
  override val layerAccentHover03 = gray20Hover
  override val layerAccentActive03 = gray40

  // field
  override val field01 = gray10
  override val fieldHover01 = gray10Hover
  override val field02 = white
  override val fieldHover02 = gray10Hover
  override val field03 = gray10
  override val fieldHover03 = gray10Hover

  // border
  override val borderInteractive = blue60
  override val borderSubtle00 = gray20
  override val borderSubtle01 = gray30
  override val borderSubtleSelected01 = gray30
  override val borderSubtle02 = gray20
  override val borderSubtleSelected02 = gray30
  override val borderSubtle03 = gray30
  override val borderSubtleSelected03 = gray30
  override val borderInverse = gray100
  override val borderStrong01 = gray50
  override val borderStrong02 = gray50
  override val borderStrong03 = gray50
  override val borderTile01 = gray30
  override val borderTile02 = gray40
  override val borderTile03 = gray30
  override val borderDisabled = gray30

  // text
  override val textPrimary = gray100
  override val textSecondary = gray70
  override val textPlaceholder = gray100.copy(alpha = 0.4f)
  override val textOnColor = white
  override val textOnColorDisabled = gray50
  override val textHelper = gray60
  override val textError = red60
  override val textInverse = white
  override val textDisabled = gray100.copy(alpha = 0.25f)

  // link
  override val linkPrimary = blue60
  override val linkPrimaryHover = blue70
  override val linkSecondary = blue70
  override val linkInverse = blue40
  override val linkInverseHover = blue30
  override val linkInverseActive = gray10
  override val linkInverseVisited = purple40
  override val linkVisited = purple60

  // icon
  override val iconPrimary = gray100
  override val iconSecondary = gray70
  override val iconInverse = white
  override val iconOnColor = white
  override val iconOnColorDisabled = gray50
  override val iconDisabled = gray100.copy(alpha = 0.25f)
  override val iconInteractive = blue60

  // support
  override val supportError = red60
  override val supportSuccess = green50
  override val supportWarning = yellow30
  override val supportInfo = blue70
  override val supportErrorInverse = red50
  override val supportSuccessInverse = green40
  override val supportWarningInverse = yellow30
  override val supportInfoInverse = blue50
  override val supportCautionMajor = orange40
  override val supportCautionMinor = yellow30
  override val supportCautionUndefined = purple60
  override val supportAccent = green50 // Color(0xffff5733)

  // focus
  override val focus = blue60
  override val focusInset = white
  override val focusInverse = white

  // miscellaneous
  override val interactive = blue60
  override val highlight = blue20
  override val toggleOff = gray50
  override val overlay = black.copy(alpha = 0.6f)
  override val shadow = black.copy(alpha = 0.3f)
  override val skeletonBackground = gray10Hover
  override val skeletonElement = gray30

  // button
  override val buttonPrimary = blue60
  override val buttonPrimaryHover = blue60Hover
  override val buttonPrimaryActive = blue80
  override val buttonSecondary = gray80
  override val buttonSecondaryHover = gray80Hover
  override val buttonSecondaryActive = gray60
  override val buttonTertiary = blue60
  override val buttonTertiaryHover = blue60Hover
  override val buttonTertiaryActive = blue80
  override val buttonDangerPrimary = red60
  override val buttonDangerSecondary = red60
  override val buttonDangerHover = Color(0xffb81921)
  override val buttonDangerActive = red80
  override val buttonSeparator = gray20
  override val buttonDisabled = gray30

  // tags
  override val tagGray = ColorPair(gray20, gray100, gray20Hover, gray40)
  override val tagCoolGray = ColorPair(coolGray20, coolGray100, coolGray20Hover, coolGray40)
  override val tagWarmGray = ColorPair(warmGray20, warmGray100, warmGray20Hover, warmGray40)
  override val tagBlue = ColorPair(blue20, blue70, blue20Hover, blue40)
  override val tagGreen = ColorPair(green20, green70, green20Hover, green40)
  override val tagRed = ColorPair(red20, red70, red20Hover, red40)
  override val tagMagenta = ColorPair(magenta20, magenta70, magenta20Hover, magenta40)
  override val tagPurple = ColorPair(purple20, purple70, purple20Hover, purple40)
  override val tagCyan = ColorPair(cyan20, cyan70, cyan20Hover, cyan40)
  override val tagTeal = ColorPair(teal20, teal70, teal20Hover, teal40)
}

@Immutable
object Gray90Colors : Colors {
  // background
  override val background = gray90
  override val backgroundHover = gray50.copy(alpha = 0.16f)
  override val backgroundActive = gray50.copy(alpha = 0.4f)
  override val backgroundSelected = gray50.copy(alpha = 0.24f)
  override val backgroundSelectedHover = gray50.copy(alpha = 0.32f)
  override val backgroundInverse = gray10
  override val backgroundInverseHover = gray10Hover
  override val backgroundBrand = blue60

  // layer
  override val layer01 = gray80
  override val layer01OnMap = gray80.copy(alpha = 0.9f)
  override val layerHover01 = gray80Hover
  override val layerActive01 = gray60
  override val layerSelected01 = gray70
  override val layerSelectedHover01 = gray70Hover
  override val layerBackground01 = gray90
  override val layer02 = gray70
  override val layer02OnMap = gray70.copy(alpha = 0.9f)
  override val layerHover02 = gray70Hover
  override val layerActive02 = gray50
  override val layerSelected02 = gray60
  override val layerSelectedHover02 = gray60Hover
  override val layerBackground02 = gray80
  override val layer03 = gray60
  override val layerHover03 = gray60Hover
  override val layerActive03 = gray80
  override val layerSelected03 = gray70
  override val layerSelectedHover03 = gray70Hover
  override val layerBackground03 = gray70
  override val layerSelectedInverse = gray10
  override val layerSelectedDisabled = gray40
  override val layerAccent01 = gray70
  override val layerAccentHover01 = gray70Hover
  override val layerAccentActive01 = gray50
  override val layerAccent02 = gray60
  override val layerAccentHover02 = gray60Hover
  override val layerAccentActive02 = gray80
  override val layerAccent03 = gray50
  override val layerAccentHover03 = gray50Hover
  override val layerAccentActive03 = gray70

  // field
  override val field01 = gray80
  override val fieldHover01 = gray80Hover
  override val field02 = gray70
  override val fieldHover02 = gray70Hover
  override val field03 = gray60
  override val fieldHover03 = gray60Hover

  // border
  override val borderInteractive = blue50
  override val borderSubtle00 = gray70
  override val borderSubtle01 = gray60
  override val borderSubtleSelected01 = gray50
  override val borderSubtle02 = gray50
  override val borderSubtleSelected02 = gray40
  override val borderSubtle03 = gray50
  override val borderSubtleSelected03 = gray40
  override val borderInverse = gray10
  override val borderStrong01 = gray50
  override val borderStrong02 = gray40
  override val borderStrong03 = gray30
  override val borderTile01 = gray60
  override val borderTile02 = gray50
  override val borderTile03 = gray40
  override val borderDisabled = gray50.copy(alpha = 0.5f)

  // text
  override val textPrimary = gray10
  override val textSecondary = gray30
  override val textPlaceholder = gray10.copy(alpha = 0.4f)
  override val textOnColor = white
  override val textOnColorDisabled = white.copy(alpha = 0.25f)
  override val textHelper = gray30
  override val textError = red30
  override val textInverse = gray100
  override val textDisabled = gray10.copy(alpha = 0.25f)

  // link
  override val linkPrimary = blue40
  override val linkPrimaryHover = blue30
  override val linkSecondary = blue30
  override val linkInverse = blue60
  override val linkInverseHover = blue70
  override val linkInverseActive = gray100
  override val linkInverseVisited = purple60
  override val linkVisited = purple40

  // icon
  override val iconPrimary = gray10
  override val iconSecondary = gray30
  override val iconInverse = gray100
  override val iconOnColor = white
  override val iconOnColorDisabled = white.copy(alpha = 0.25f)
  override val iconDisabled = gray10.copy(alpha = 0.25f)
  override val iconInteractive = white

  // support
  override val supportError = red40
  override val supportSuccess = green40
  override val supportWarning = yellow30
  override val supportInfo = blue50
  override val supportErrorInverse = red60
  override val supportSuccessInverse = green50
  override val supportWarningInverse = yellow30
  override val supportInfoInverse = blue70
  override val supportCautionMajor = orange40
  override val supportCautionMinor = yellow30
  override val supportCautionUndefined = purple50
  override val supportAccent = green50 // Color(0xffff5733)

  // focus
  override val focus = white
  override val focusInset = gray100
  override val focusInverse = blue60

  // miscellaneous
  override val interactive = blue50
  override val highlight = blue80
  override val toggleOff = gray50
  override val overlay = black.copy(alpha = 0.6f)
  override val shadow = black.copy(alpha = 0.8f)
  override val skeletonBackground = gray90Hover
  override val skeletonElement = gray70

  // button
  override val buttonPrimary = blue60
  override val buttonPrimaryHover = blue60Hover
  override val buttonPrimaryActive = blue80
  override val buttonSecondary = gray60
  override val buttonSecondaryHover = gray60Hover
  override val buttonSecondaryActive = gray80
  override val buttonTertiary = white
  override val buttonTertiaryHover = gray10
  override val buttonTertiaryActive = gray30
  override val buttonDangerPrimary = red60
  override val buttonDangerSecondary = red40
  override val buttonDangerHover = Color(0xffb81921)
  override val buttonDangerActive = red80
  override val buttonSeparator = gray100
  override val buttonDisabled = gray50.copy(alpha = 0.3f)

  // tags
  override val tagGray = ColorPair(gray70, gray10, gray70Hover, gray50)
  override val tagCoolGray = ColorPair(coolGray70, coolGray10, coolGray70Hover, coolGray50)
  override val tagWarmGray = ColorPair(warmGray70, warmGray10, warmGray70Hover, warmGray50)
  override val tagBlue = ColorPair(blue70, blue20, blue70Hover, blue50)
  override val tagGreen = ColorPair(green70, green20, green70Hover, green50)
  override val tagRed = ColorPair(red70, red20, red70Hover, red50)
  override val tagMagenta = ColorPair(magenta70, magenta20, magenta70Hover, magenta50)
  override val tagPurple = ColorPair(purple70, purple20, purple70Hover, purple50)
  override val tagCyan = ColorPair(cyan70, cyan20, cyan70Hover, cyan50)
  override val tagTeal = ColorPair(teal70, teal20, teal70Hover, teal50)
}

val whiteColors: Colors = WhiteColors
val gray90Colors: Colors = Gray90Colors
