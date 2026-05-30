// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AugmentedReality: ImageVector
  get() {
    val current = _augmentedReality
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.AugmentedReality",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m27.45 9.1 -6 -3 a1 1 0 0 0 -.9 0 l-6 3 A1 1 0 0 0 14 10 v7 a1 1 0 0 0 .55 .9 l6 3 a1 1 0 0 0 .9 0 l6 -3 A1 1 0 0 0 28 17 v-7 a1 1 0 0 0 -.55 -.9 M21 8.13 24.76 10 21 11.88 17.24 10Z m-5 3.5 4 2 v4.76 l-4 -2Z m6 6.76 v-4.76 l4 -2 v4.76Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27.45 9.1
          moveTo(x = 27.45f, y = 9.1f)
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
          // A 1 1 0 0 0 14 10
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 14.0f,
            y1 = 10.0f,
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
          // l 6 -3
          lineToRelative(dx = 6.0f, dy = -3.0f)
          // A 1 1 0 0 0 28 17
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 28.0f,
            y1 = 17.0f,
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
          // M 21 8.13
          moveTo(x = 21.0f, y = 8.13f)
          // L 24.76 10
          lineTo(x = 24.76f, y = 10.0f)
          // L 21 11.88
          lineTo(x = 21.0f, y = 11.88f)
          // L 17.24 10z
          lineTo(x = 17.24f, y = 10.0f)
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
          // m 6 6.76
          moveToRelative(dx = 6.0f, dy = 6.76f)
          // v -4.76
          verticalLineToRelative(dy = -4.76f)
          // l 4 -2
          lineToRelative(dx = 4.0f, dy = -2.0f)
          // v 4.76z
          verticalLineToRelative(dy = 4.76f)
          close()
        }
        // <circle cx="13.5" cy="24.5" radius="1.5" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13.5 24.5
          moveTo(x = 13.5f, y = 24.5f)
          // m -1.5 0
          moveToRelative(dx = -1.5f, dy = 0.0f)
          // a 1.5 1.5 0 1 1 3 0
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = 0.0f,
          )
          // a 1.5 1.5 0 1 1 -3 0z
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M20 30 H7 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h13 v2 H7 v24 h13 v-4 h2 v4 a2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 30
          moveTo(x = 20.0f, y = 30.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
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
          // V 4
          verticalLineTo(y = 4.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 13
          horizontalLineToRelative(dx = 13.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
          // v 24
          verticalLineToRelative(dy = 24.0f)
          // h 13
          horizontalLineToRelative(dx = 13.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
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
      .also { _augmentedReality = it }
  }

@Suppress("ObjectPropertyName")
private var _augmentedReality: ImageVector? = null
