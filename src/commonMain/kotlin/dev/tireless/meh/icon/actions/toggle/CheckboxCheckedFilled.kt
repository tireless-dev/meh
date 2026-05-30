// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CheckboxCheckedFilled: ImageVector
  get() {
    val current = _checkboxCheckedFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CheckboxCheckedFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 4 H6 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h20 a2 2 0 0 0 2 -2 V6 a2 2 0 0 0 -2 -2 M14 21.5 l-5 -4.96 L10.6 15 l3.4 3.35 L21.4 11 l1.6 1.58Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 4
          moveTo(x = 26.0f, y = 4.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // V 6
          verticalLineTo(y = 6.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // M 14 21.5
          moveTo(x = 14.0f, y = 21.5f)
          // l -5 -4.96
          lineToRelative(dx = -5.0f, dy = -4.96f)
          // L 10.6 15
          lineTo(x = 10.6f, y = 15.0f)
          // l 3.4 3.35
          lineToRelative(dx = 3.4f, dy = 3.35f)
          // L 21.4 11
          lineTo(x = 21.4f, y = 11.0f)
          // l 1.6 1.58z
          lineToRelative(dx = 1.6f, dy = 1.58f)
          close()
        }
        // m14 21.5 -5 -4.96 L10.6 15 l3.4 3.35 L21.4 11 l1.6 1.58Z
        path {
          // M 14 21.5
          moveTo(x = 14.0f, y = 21.5f)
          // l -5 -4.96
          lineToRelative(dx = -5.0f, dy = -4.96f)
          // L 10.6 15
          lineTo(x = 10.6f, y = 15.0f)
          // l 3.4 3.35
          lineToRelative(dx = 3.4f, dy = 3.35f)
          // L 21.4 11
          lineTo(x = 21.4f, y = 11.0f)
          // l 1.6 1.58z
          lineToRelative(dx = 1.6f, dy = 1.58f)
          close()
        }
        // <rect width="32" height="32" fill="#000" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 0 0
          moveTo(x = 0.0f, y = 0.0f)
          // h 32
          horizontalLineToRelative(dx = 32.0f)
          // v 32
          verticalLineToRelative(dy = 32.0f)
          // h -32z
          horizontalLineToRelative(dx = -32.0f)
          close()
        }
      }.build()
      .also { _checkboxCheckedFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _checkboxCheckedFilled: ImageVector? = null
