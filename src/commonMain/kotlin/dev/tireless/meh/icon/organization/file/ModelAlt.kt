// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ModelAlt: ImageVector
  get() {
    val current = _modelAlt
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ModelAlt",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28.45 16.1 23 13.39 V7 a1 1 0 0 0 -.55 -.9 l-6 -3 a1 1 0 0 0 -.9 0 l-6 3 A1 1 0 0 0 9 7 v6.38 l-5.45 2.73 A1 1 0 0 0 3 17 v7 a1 1 0 0 0 .55 .9 l6 3 a1 1 0 0 0 .9 0 L16 25.11 l5.55 2.77 a1 1 0 0 0 .9 0 l6 -3 A1 1 0 0 0 29 24 v-7 a1 1 0 0 0 -.55 -.9 M21 13.39 l-4 2 v-4.76 l4 -2Z m-5 -8.26 L19.76 7 16 8.88 12.24 7Z m-5 3.5 4 2 v4.76 l-4 -2Z M9 25.38 l-4 -2 v-4.76 l4 2Z m1 -6.5 L6.24 17 10 15.12 13.76 17Z m1 1.74 4 -2 v4.76 l-4 2Z m10 4.76 -4 -2 v-4.76 l4 2Z m1 -6.5 L18.24 17 22 15.12 25.76 17Z m5 4.5 -4 2 v-4.76 l4 -2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28.45 16.1
          moveTo(x = 28.45f, y = 16.1f)
          // L 23 13.39
          lineTo(x = 23.0f, y = 13.39f)
          // V 7
          verticalLineTo(y = 7.0f)
          // a 1 1 0 0 0 -0.55 -0.9
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.55f,
            dy1 = -0.9f,
          )
          // l -6 -3
          lineToRelative(dx = -6.0f, dy = -3.0f)
          // a 1 1 0 0 0 -0.9 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.9f,
            dy1 = 0.0f,
          )
          // l -6 3
          lineToRelative(dx = -6.0f, dy = 3.0f)
          // A 1 1 0 0 0 9 7
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 9.0f,
            y1 = 7.0f,
          )
          // v 6.38
          verticalLineToRelative(dy = 6.38f)
          // l -5.45 2.73
          lineToRelative(dx = -5.45f, dy = 2.73f)
          // A 1 1 0 0 0 3 17
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 3.0f,
            y1 = 17.0f,
          )
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // a 1 1 0 0 0 0.55 0.9
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.55f,
            dy1 = 0.9f,
          )
          // l 6 3
          lineToRelative(dx = 6.0f, dy = 3.0f)
          // a 1 1 0 0 0 0.9 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.9f,
            dy1 = 0.0f,
          )
          // L 16 25.11
          lineTo(x = 16.0f, y = 25.11f)
          // l 5.55 2.77
          lineToRelative(dx = 5.55f, dy = 2.77f)
          // a 1 1 0 0 0 0.9 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.9f,
            dy1 = 0.0f,
          )
          // l 6 -3
          lineToRelative(dx = 6.0f, dy = -3.0f)
          // A 1 1 0 0 0 29 24
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 29.0f,
            y1 = 24.0f,
          )
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // a 1 1 0 0 0 -0.55 -0.9
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.55f,
            dy1 = -0.9f,
          )
          // M 21 13.39
          moveTo(x = 21.0f, y = 13.39f)
          // l -4 2
          lineToRelative(dx = -4.0f, dy = 2.0f)
          // v -4.76
          verticalLineToRelative(dy = -4.76f)
          // l 4 -2z
          lineToRelative(dx = 4.0f, dy = -2.0f)
          close()
          // m -5 -8.26
          moveToRelative(dx = -5.0f, dy = -8.26f)
          // L 19.76 7
          lineTo(x = 19.76f, y = 7.0f)
          // L 16 8.88
          lineTo(x = 16.0f, y = 8.88f)
          // L 12.24 7z
          lineTo(x = 12.24f, y = 7.0f)
          close()
          // m -5 3.5
          moveToRelative(dx = -5.0f, dy = 3.5f)
          // l 4 2
          lineToRelative(dx = 4.0f, dy = 2.0f)
          // v 4.76
          verticalLineToRelative(dy = 4.76f)
          // l -4 -2z
          lineToRelative(dx = -4.0f, dy = -2.0f)
          close()
          // M 9 25.38
          moveTo(x = 9.0f, y = 25.38f)
          // l -4 -2
          lineToRelative(dx = -4.0f, dy = -2.0f)
          // v -4.76
          verticalLineToRelative(dy = -4.76f)
          // l 4 2z
          lineToRelative(dx = 4.0f, dy = 2.0f)
          close()
          // m 1 -6.5
          moveToRelative(dx = 1.0f, dy = -6.5f)
          // L 6.24 17
          lineTo(x = 6.24f, y = 17.0f)
          // L 10 15.12
          lineTo(x = 10.0f, y = 15.12f)
          // L 13.76 17z
          lineTo(x = 13.76f, y = 17.0f)
          close()
          // m 1 1.74
          moveToRelative(dx = 1.0f, dy = 1.74f)
          // l 4 -2
          lineToRelative(dx = 4.0f, dy = -2.0f)
          // v 4.76
          verticalLineToRelative(dy = 4.76f)
          // l -4 2z
          lineToRelative(dx = -4.0f, dy = 2.0f)
          close()
          // m 10 4.76
          moveToRelative(dx = 10.0f, dy = 4.76f)
          // l -4 -2
          lineToRelative(dx = -4.0f, dy = -2.0f)
          // v -4.76
          verticalLineToRelative(dy = -4.76f)
          // l 4 2z
          lineToRelative(dx = 4.0f, dy = 2.0f)
          close()
          // m 1 -6.5
          moveToRelative(dx = 1.0f, dy = -6.5f)
          // L 18.24 17
          lineTo(x = 18.24f, y = 17.0f)
          // L 22 15.12
          lineTo(x = 22.0f, y = 15.12f)
          // L 25.76 17z
          lineTo(x = 25.76f, y = 17.0f)
          close()
          // m 5 4.5
          moveToRelative(dx = 5.0f, dy = 4.5f)
          // l -4 2
          lineToRelative(dx = -4.0f, dy = 2.0f)
          // v -4.76
          verticalLineToRelative(dy = -4.76f)
          // l 4 -2z
          lineToRelative(dx = 4.0f, dy = -2.0f)
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
      .also { _modelAlt = it }
  }

@Suppress("ObjectPropertyName")
private var _modelAlt: ImageVector? = null
