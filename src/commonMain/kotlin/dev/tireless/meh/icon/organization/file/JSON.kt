// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val JSON: ImageVector
  get() {
    val current = _jSON
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.JSON",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="31.0 11.0 31.0 21.0 29.0 21.0 27.0 15.0 27.0 21.0 25.0 21.0 25.0 11.0 27.0 11.0 29.0 17.0 29.0 11.0 31.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 31 11
          moveTo(x = 31.0f, y = 11.0f)
          // L 31 21
          lineTo(x = 31.0f, y = 21.0f)
          // L 29 21
          lineTo(x = 29.0f, y = 21.0f)
          // L 27 15
          lineTo(x = 27.0f, y = 15.0f)
          // L 27 21
          lineTo(x = 27.0f, y = 21.0f)
          // L 25 21
          lineTo(x = 25.0f, y = 21.0f)
          // L 25 11
          lineTo(x = 25.0f, y = 11.0f)
          // L 27 11
          lineTo(x = 27.0f, y = 11.0f)
          // L 29 17
          lineTo(x = 29.0f, y = 17.0f)
          // L 29 11
          lineTo(x = 29.0f, y = 11.0f)
          // L 31 11z
          lineTo(x = 31.0f, y = 11.0f)
          close()
        }
        // M21.33 21 h-2.66 A1.67 1.67 0 0 1 17 19.33 v-6.66 A1.67 1.67 0 0 1 18.67 11 h2.66 A1.67 1.67 0 0 1 23 12.67 v6.66 A1.67 1.67 0 0 1 21.33 21 M19 19 h2 v-6 h-2Z m-5.67 2 H9 v-2 h4 v-2 h-2 a2 2 0 0 1 -2 -2 v-2.33 A1.67 1.67 0 0 1 10.67 11 H15 v2 h-4 v2 h2 a2 2 0 0 1 2 2 v2.33 A1.67 1.67 0 0 1 13.33 21 m-8 0 H2.67 A1.67 1.67 0 0 1 1 19.33 V17 h2 v2 h2 v-8 h2 v8.33 A1.67 1.67 0 0 1 5.33 21
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21.33 21
          moveTo(x = 21.33f, y = 21.0f)
          // h -2.66
          horizontalLineToRelative(dx = -2.66f)
          // A 1.67 1.67 0 0 1 17 19.33
          arcTo(
            horizontalEllipseRadius = 1.67f,
            verticalEllipseRadius = 1.67f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 17.0f,
            y1 = 19.33f,
          )
          // v -6.66
          verticalLineToRelative(dy = -6.66f)
          // A 1.67 1.67 0 0 1 18.67 11
          arcTo(
            horizontalEllipseRadius = 1.67f,
            verticalEllipseRadius = 1.67f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 18.67f,
            y1 = 11.0f,
          )
          // h 2.66
          horizontalLineToRelative(dx = 2.66f)
          // A 1.67 1.67 0 0 1 23 12.67
          arcTo(
            horizontalEllipseRadius = 1.67f,
            verticalEllipseRadius = 1.67f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 23.0f,
            y1 = 12.67f,
          )
          // v 6.66
          verticalLineToRelative(dy = 6.66f)
          // A 1.67 1.67 0 0 1 21.33 21
          arcTo(
            horizontalEllipseRadius = 1.67f,
            verticalEllipseRadius = 1.67f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 21.33f,
            y1 = 21.0f,
          )
          // M 19 19
          moveTo(x = 19.0f, y = 19.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
          // m -5.67 2
          moveToRelative(dx = -5.67f, dy = 2.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // v -2.33
          verticalLineToRelative(dy = -2.33f)
          // A 1.67 1.67 0 0 1 10.67 11
          arcTo(
            horizontalEllipseRadius = 1.67f,
            verticalEllipseRadius = 1.67f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 10.67f,
            y1 = 11.0f,
          )
          // H 15
          horizontalLineTo(x = 15.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 2.33
          verticalLineToRelative(dy = 2.33f)
          // A 1.67 1.67 0 0 1 13.33 21
          arcTo(
            horizontalEllipseRadius = 1.67f,
            verticalEllipseRadius = 1.67f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 13.33f,
            y1 = 21.0f,
          )
          // m -8 0
          moveToRelative(dx = -8.0f, dy = 0.0f)
          // H 2.67
          horizontalLineTo(x = 2.67f)
          // A 1.67 1.67 0 0 1 1 19.33
          arcTo(
            horizontalEllipseRadius = 1.67f,
            verticalEllipseRadius = 1.67f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 1.0f,
            y1 = 19.33f,
          )
          // V 17
          verticalLineTo(y = 17.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 8.33
          verticalLineToRelative(dy = 8.33f)
          // A 1.67 1.67 0 0 1 5.33 21
          arcTo(
            horizontalEllipseRadius = 1.67f,
            verticalEllipseRadius = 1.67f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 5.33f,
            y1 = 21.0f,
          )
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
      .also { _jSON = it }
  }

@Suppress("ObjectPropertyName")
private var _jSON: ImageVector? = null
