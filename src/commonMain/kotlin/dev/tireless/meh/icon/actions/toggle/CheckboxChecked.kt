// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CheckboxChecked: ImageVector
  get() {
    val current = _checkboxChecked
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CheckboxChecked",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 4 H6 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h20 a2 2 0 0 0 2 -2 V6 a2 2 0 0 0 -2 -2 M6 26 V6 h20 v20Z
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
          // M 6 26
          moveTo(x = 6.0f, y = 26.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // v 20z
          verticalLineToRelative(dy = 20.0f)
          close()
        }
        // <polygon points="14.0 21.5 9.0 16.54 10.59 15.0 14.0 18.35 21.41 11.0 23.0 12.58 14.0 21.5" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 21.5
          moveTo(x = 14.0f, y = 21.5f)
          // L 9 16.54
          lineTo(x = 9.0f, y = 16.54f)
          // L 10.59 15
          lineTo(x = 10.59f, y = 15.0f)
          // L 14 18.35
          lineTo(x = 14.0f, y = 18.35f)
          // L 21.41 11
          lineTo(x = 21.41f, y = 11.0f)
          // L 23 12.58
          lineTo(x = 23.0f, y = 12.58f)
          // L 14 21.5z
          lineTo(x = 14.0f, y = 21.5f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
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
      .also { _checkboxChecked = it }
  }

@Suppress("ObjectPropertyName")
private var _checkboxChecked: ImageVector? = null
