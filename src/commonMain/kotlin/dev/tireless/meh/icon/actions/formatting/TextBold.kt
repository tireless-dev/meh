// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextBold: ImageVector
  get() {
    val current = _textBold
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TextBold",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M18.25 25 H9 V7 h8.5 a5.25 5.25 0 0 1 4 8.65 A5.25 5.25 0 0 1 18.25 25 M12 22 h6.23 a2.25 2.25 0 1 0 0 -4.5 H12Z m0 -7.5 h5.5 a2.25 2.25 0 1 0 0 -4.5 H12Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18.25 25
          moveTo(x = 18.25f, y = 25.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // V 7
          verticalLineTo(y = 7.0f)
          // h 8.5
          horizontalLineToRelative(dx = 8.5f)
          // a 5.25 5.25 0 0 1 4 8.65
          arcToRelative(
            a = 5.25f,
            b = 5.25f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 8.65f,
          )
          // A 5.25 5.25 0 0 1 18.25 25
          arcTo(
            horizontalEllipseRadius = 5.25f,
            verticalEllipseRadius = 5.25f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 18.25f,
            y1 = 25.0f,
          )
          // M 12 22
          moveTo(x = 12.0f, y = 22.0f)
          // h 6.23
          horizontalLineToRelative(dx = 6.23f)
          // a 2.25 2.25 0 1 0 0 -4.5
          arcToRelative(
            a = 2.25f,
            b = 2.25f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -4.5f,
          )
          // H 12z
          horizontalLineTo(x = 12.0f)
          close()
          // m 0 -7.5
          moveToRelative(dx = 0.0f, dy = -7.5f)
          // h 5.5
          horizontalLineToRelative(dx = 5.5f)
          // a 2.25 2.25 0 1 0 0 -4.5
          arcToRelative(
            a = 2.25f,
            b = 2.25f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -4.5f,
          )
          // H 12z
          horizontalLineTo(x = 12.0f)
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
      .also { _textBold = it }
  }

@Suppress("ObjectPropertyName")
private var _textBold: ImageVector? = null
