// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Language: ImageVector
  get() {
    val current = _language
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Language",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="6" height="2" x="18.0" y="19.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 19
          moveTo(x = 18.0f, y = 19.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
        }
        // <rect width="12" height="2" x="18.0" y="15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 15
          moveTo(x = 18.0f, y = 15.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -12z
          horizontalLineToRelative(dx = -12.0f)
          close()
        }
        // <rect width="12" height="2" x="18.0" y="11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 11
          moveTo(x = 18.0f, y = 11.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -12z
          horizontalLineToRelative(dx = -12.0f)
          close()
        }
        // M14 21 v-2 H9 v-2 H7 v2 H2 v2 h8.21 A8.6 8.6 0 0 1 8 24.98 9 9 0 0 1 6.55 23 H4.33 a11 11 0 0 0 2.15 3.3 A15 15 0 0 1 3 28.13 L3.7 30 A16 16 0 0 0 8 27.66 17 17 0 0 0 12.3 30 l.7 -1.87 a15 15 0 0 1 -3.48 -1.83 10.3 10.3 0 0 0 2.73 -5.3Z m-2.83 -8 h2.16 L8.75 2 H6.58 L2 13 h2.17 L5 11 h5.33Z M5.83 9 l1.84 -4.4 L9.5 9Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 21
          moveTo(x = 14.0f, y = 21.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 8.21
          horizontalLineToRelative(dx = 8.21f)
          // A 8.6 8.6 0 0 1 8 24.98
          arcTo(
            horizontalEllipseRadius = 8.6f,
            verticalEllipseRadius = 8.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 8.0f,
            y1 = 24.98f,
          )
          // A 9 9 0 0 1 6.55 23
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 6.55f,
            y1 = 23.0f,
          )
          // H 4.33
          horizontalLineTo(x = 4.33f)
          // a 11 11 0 0 0 2.15 3.3
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.15f,
            dy1 = 3.3f,
          )
          // A 15 15 0 0 1 3 28.13
          arcTo(
            horizontalEllipseRadius = 15.0f,
            verticalEllipseRadius = 15.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 3.0f,
            y1 = 28.13f,
          )
          // L 3.7 30
          lineTo(x = 3.7f, y = 30.0f)
          // A 16 16 0 0 0 8 27.66
          arcTo(
            horizontalEllipseRadius = 16.0f,
            verticalEllipseRadius = 16.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.0f,
            y1 = 27.66f,
          )
          // A 17 17 0 0 0 12.3 30
          arcTo(
            horizontalEllipseRadius = 17.0f,
            verticalEllipseRadius = 17.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 12.3f,
            y1 = 30.0f,
          )
          // l 0.7 -1.87
          lineToRelative(dx = 0.7f, dy = -1.87f)
          // a 15 15 0 0 1 -3.48 -1.83
          arcToRelative(
            a = 15.0f,
            b = 15.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.48f,
            dy1 = -1.83f,
          )
          // a 10.3 10.3 0 0 0 2.73 -5.3z
          arcToRelative(
            a = 10.3f,
            b = 10.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.73f,
            dy1 = -5.3f,
          )
          close()
          // m -2.83 -8
          moveToRelative(dx = -2.83f, dy = -8.0f)
          // h 2.16
          horizontalLineToRelative(dx = 2.16f)
          // L 8.75 2
          lineTo(x = 8.75f, y = 2.0f)
          // H 6.58
          horizontalLineTo(x = 6.58f)
          // L 2 13
          lineTo(x = 2.0f, y = 13.0f)
          // h 2.17
          horizontalLineToRelative(dx = 2.17f)
          // L 5 11
          lineTo(x = 5.0f, y = 11.0f)
          // h 5.33z
          horizontalLineToRelative(dx = 5.33f)
          close()
          // M 5.83 9
          moveTo(x = 5.83f, y = 9.0f)
          // l 1.84 -4.4
          lineToRelative(dx = 1.84f, dy = -4.4f)
          // L 9.5 9z
          lineTo(x = 9.5f, y = 9.0f)
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
      .also { _language = it }
  }

@Suppress("ObjectPropertyName")
private var _language: ImageVector? = null
