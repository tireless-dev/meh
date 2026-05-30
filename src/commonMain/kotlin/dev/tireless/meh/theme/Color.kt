// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

val gray100 = Color(0xff161616)
val gray90 = Color(0xff262626)
val gray80 = Color(0xff393939)
val gray70 = Color(0xff525252)
val gray60 = Color(0xff6f6f6f)
val gray50 = Color(0xff8d8d8d)
val gray40 = Color(0xffa8a8a8)
val gray30 = Color(0xffc6c6c6)
val gray20 = Color(0xffe0e0e0)
val gray10 = Color(0xfff4f4f4)
val white = Color(0xffffffff)
val red60 = Color(0xffda1e28)
val red30 = Color(0xffffb3b8)
val red40 = Color(0xffff8389)
val green50 = Color(0xff24a148)
val green40 = Color(0xff42be65)
val yellow30 = Color(0xfff1c21b)
val blue80 = Color(0xff002d9c)
val blue70 = Color(0xff0043ce)
val blue60 = Color(0xff0f62fe)
val blue50 = Color(0xff4589ff)
val blue40 = Color(0xff78a9ff)
val blue20 = Color(0xffd0e2ff)

@Immutable
data class Colors(
  // background
  val background: Color,
  // layer
  val layer01: Color,
  val layer01OnMap: Color,
  val layer02: Color,
  val layer02OnMap: Color,
  // field
  val field02: Color,
  // border
  val borderInteractive: Color,
  val borderSubtle00: Color,
  val borderSubtle01: Color,
  val borderSubtle02: Color,
  val borderInverse: Color,
  val borderStrong01: Color,
  val borderStrong02: Color,
  val borderStrong03: Color,
  // text
  val textPrimary: Color,
  val textSecondary: Color,
  val textOnColor: Color,
  val textHelper: Color,
  val textPlaceholder: Color,
  val textError: Color,
  val textDisabled: Color,
  // link
  val linkPrimary: Color,
  // icon
  val iconPrimary: Color,
  val iconSecondary: Color,
  val iconOnColor: Color,
  val iconOnColorDisabled: Color,
  val iconDisabled: Color,
  // support
  val supportError: Color,
  val supportSuccess: Color,
  val supportWarning: Color,
  val supportInfo: Color,
  val supportAccent: Color,
  // focus
  val focus: Color,
  val focusInset: Color,
  val focusInverse: Color,
  // miscellaneous
  val interactive: Color,
  val highlight: Color,
  val toggleOff: Color,
  val overlay: Color,
  // button
  val buttonPrimary: Color,
  val buttonSecondary: Color,
  val buttonDangerPrimary: Color,
)

val whiteColors get() =
  Colors(
    // background
    background = white,
    // layer
    layer01 = gray10,
    layer01OnMap = gray10.copy(alpha = 0.9f),
    layer02 = white,
    layer02OnMap = white.copy(alpha = 0.9f),
    // field
    field02 = white,
    // border
    borderInteractive = blue60,
    borderSubtle00 = gray20,
    borderSubtle01 = gray30,
    borderSubtle02 = gray20,
    borderInverse = gray100,
    borderStrong01 = gray50,
    borderStrong02 = gray50,
    borderStrong03 = gray50,
    // text
    textPrimary = gray100,
    textSecondary = gray70,
    textPlaceholder = gray40,
    textOnColor = white,
    textHelper = gray60,
    textError = red60,
    textDisabled = gray100.copy(alpha = 0.25f),
    // link
    linkPrimary = blue60,
    // icon
    iconPrimary = gray100,
    iconSecondary = gray70,
    iconOnColor = white,
    iconOnColorDisabled = gray50,
    iconDisabled = gray100.copy(alpha = 0.25f),
    // support
    supportError = red60,
    supportSuccess = green50,
    supportWarning = yellow30,
    supportInfo = blue70,
    supportAccent = green50, // Color(0xffff5733),
    // focus
    focus = blue60,
    focusInset = white,
    focusInverse = white,
    // miscellaneous
    interactive = blue60,
    highlight = blue20,
    toggleOff = gray50,
    overlay = gray100.copy(alpha = 0.7f),
    // button
    buttonPrimary = blue60,
    buttonSecondary = gray80,
    buttonDangerPrimary = red60,
  )

val gray90Colors get() =
  Colors(
    // background
    background = gray90,
    // layer
    layer01 = gray80,
    layer01OnMap = gray80.copy(alpha = 0.9f),
    layer02 = gray70,
    layer02OnMap = gray70.copy(alpha = 0.9f),
    // field
    field02 = gray70,
    // border
    borderInteractive = blue50,
    borderSubtle00 = gray70,
    borderSubtle01 = gray70,
    borderSubtle02 = gray60,
    borderInverse = gray10,
    borderStrong01 = gray50,
    borderStrong02 = gray40,
    borderStrong03 = gray30,
    // text
    textPrimary = gray10,
    textSecondary = gray30,
    textPlaceholder = gray60,
    textOnColor = white,
    textHelper = gray50,
    textError = red30,
    textDisabled = gray10.copy(alpha = 0.25f),
    // link
    linkPrimary = blue40,
    // icon
    iconPrimary = gray10,
    iconSecondary = gray30,
    iconOnColor = white,
    iconOnColorDisabled = white.copy(alpha = 0.25f),
    iconDisabled = gray10.copy(alpha = 0.25f),
    // support
    supportError = red40,
    supportSuccess = green40,
    supportWarning = yellow30,
    supportInfo = blue50,
    supportAccent = green50, // Color(0xffff5733),
    // focus
    focus = white,
    focusInset = gray100,
    focusInverse = blue60,
    // miscellaneous
    interactive = blue50,
    highlight = blue80,
    toggleOff = gray50,
    overlay = gray100.copy(alpha = 0.7f),
    // button
    buttonPrimary = blue60,
    buttonSecondary = gray60,
    buttonDangerPrimary = red40,
  )
