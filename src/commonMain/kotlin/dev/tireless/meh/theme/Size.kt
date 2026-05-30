// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

sealed interface IntSizeToken {
  val value: Int
}

// size for form controls' height
enum class ControlSize(
  override val value: Int,
) : IntSizeToken {
  Unspecified(-1),
  XSmall(24), // table row only
  Small(32),
  Medium(40),
  Large(48),
  XLarge(64), // buttons only
  XXLarge(80), // buttons only
}

enum class ToggleSize(
  override val value: Int,
) : IntSizeToken {
  Default(24),
  Small(16),
}

enum class TagSize(
  override val value: Int,
) : IntSizeToken {
  Default(24),
  Small(18),
}

enum class IconSize(
  override val value: Int,
) : IntSizeToken {
  Unspecified(-1),
  XSmall(8), // upper
  Small(16),
  Medium(24),
  Large(32),
  Expressive(20), // use in icon only button? yes!
}

enum class ModalSize(
  override val value: Int,
) : IntSizeToken {
  Wide(600),
  Fit(320),
}

@Immutable
object ControlTokens {
  val unspecified = ControlSize.Unspecified.dp
  val xsmall = ControlSize.XSmall.dp
  val small = ControlSize.Small.dp
  val medium = ControlSize.Medium.dp
  val large = ControlSize.Large.dp
  val xlarge = ControlSize.XLarge.dp
  val xxlarge = ControlSize.XXLarge.dp
}

@Immutable
object ToggleTokens {
  val default = ToggleSize.Default.dp
  val small = ToggleSize.Small.dp
}

@Immutable
object TagTokens {
  val default = TagSize.Default.dp
  val small = TagSize.Small.dp
}

@Immutable
object IconTokens {
  val unspecified = IconSize.Unspecified.dp
  val xsmall = IconSize.XSmall.dp
  val small = IconSize.Small.dp
  val medium = IconSize.Medium.dp
  val large = IconSize.Large.dp
  val expressive = IconSize.Expressive.dp
}

@Immutable
object ModalTokens {
  val wide = ModalSize.Wide.dp
  val fit = ModalSize.Fit.dp
}

@Immutable
object Size {
  val controls = ControlTokens
  val toggles = ToggleTokens
  val tags = TagTokens
  val icons = IconTokens
  val modal = ModalTokens
}

val IntSizeToken.dp: Dp
  get() =
    if (value == -1) {
      Dp.Unspecified
    } else {
      value.dp
    }
