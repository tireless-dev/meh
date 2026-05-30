// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VegetationAsset: ImageVector
  get() {
    val current = _vegetationAsset
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.VegetationAsset",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="21.5" cy="10.5" radius="1.5" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21.5 10.5
          moveTo(x = 21.5f, y = 10.5f)
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
        // M28.5 1 a2.5 2.5 0 0 0 -1.2 .31 l-8.32 4.3 a5.5 5.5 0 1 0 7.33 7.55 l4.4 -8.5 A2.5 2.5 0 0 0 28.5 1 m-7 13 a3.5 3.5 0 1 1 3.5 -3.5 3.5 3.5 0 0 1 -3.5 3.5 m7.44 -10.26 -2.38 4.6 a5.5 5.5 0 0 0 -2.9 -2.9 l4.6 -2.37 A.52 .52 0 0 1 29 3.5 a1 1 0 0 1 -.06 .24 M19 20 h7 v-2 h-9 v10 a2 2 0 0 0 2 2 h3 v-2 h-3Z m-7 10 H9 v-2 h3 V15.57 l-3.51 -2.11 1.02 -1.72 3.52 2.11 A2 2 0 0 1 14 15.57 V28 a2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28.5 1
          moveTo(x = 28.5f, y = 1.0f)
          // a 2.5 2.5 0 0 0 -1.2 0.31
          arcToRelative(
            a = 2.5f,
            b = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.2f,
            dy1 = 0.31f,
          )
          // l -8.32 4.3
          lineToRelative(dx = -8.32f, dy = 4.3f)
          // a 5.5 5.5 0 1 0 7.33 7.55
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 7.33f,
            dy1 = 7.55f,
          )
          // l 4.4 -8.5
          lineToRelative(dx = 4.4f, dy = -8.5f)
          // A 2.5 2.5 0 0 0 28.5 1
          arcTo(
            horizontalEllipseRadius = 2.5f,
            verticalEllipseRadius = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 28.5f,
            y1 = 1.0f,
          )
          // m -7 13
          moveToRelative(dx = -7.0f, dy = 13.0f)
          // a 3.5 3.5 0 1 1 3.5 -3.5
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 3.5f,
            dy1 = -3.5f,
          )
          // a 3.5 3.5 0 0 1 -3.5 3.5
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.5f,
            dy1 = 3.5f,
          )
          // m 7.44 -10.26
          moveToRelative(dx = 7.44f, dy = -10.26f)
          // l -2.38 4.6
          lineToRelative(dx = -2.38f, dy = 4.6f)
          // a 5.5 5.5 0 0 0 -2.9 -2.9
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.9f,
            dy1 = -2.9f,
          )
          // l 4.6 -2.37
          lineToRelative(dx = 4.6f, dy = -2.37f)
          // A 0.52 0.52 0 0 1 29 3.5
          arcTo(
            horizontalEllipseRadius = 0.52f,
            verticalEllipseRadius = 0.52f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 29.0f,
            y1 = 3.5f,
          )
          // a 1 1 0 0 1 -0.06 0.24
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.06f,
            dy1 = 0.24f,
          )
          // M 19 20
          moveTo(x = 19.0f, y = 20.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -9
          horizontalLineToRelative(dx = -9.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
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
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -3z
          horizontalLineToRelative(dx = -3.0f)
          close()
          // m -7 10
          moveToRelative(dx = -7.0f, dy = 10.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // V 15.57
          verticalLineTo(y = 15.57f)
          // l -3.51 -2.11
          lineToRelative(dx = -3.51f, dy = -2.11f)
          // l 1.02 -1.72
          lineToRelative(dx = 1.02f, dy = -1.72f)
          // l 3.52 2.11
          lineToRelative(dx = 3.52f, dy = 2.11f)
          // A 2 2 0 0 1 14 15.57
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 14.0f,
            y1 = 15.57f,
          )
          // V 28
          verticalLineTo(y = 28.0f)
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
        // M17.3 2.29 A10 10 0 0 0 15 2 a8 8 0 0 0 -6.92 4 H8 a6 6 0 0 0 0 12 v-2 a4 4 0 0 1 0 -8 l.39 .04 .86 .11 .3 -.66 A6 6 0 0 1 15 4 a8 8 0 0 1 1.73 .21Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17.3 2.29
          moveTo(x = 17.3f, y = 2.29f)
          // A 10 10 0 0 0 15 2
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 15.0f,
            y1 = 2.0f,
          )
          // a 8 8 0 0 0 -6.92 4
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.92f,
            dy1 = 4.0f,
          )
          // H 8
          horizontalLineTo(x = 8.0f)
          // a 6 6 0 0 0 0 12
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 12.0f,
          )
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // a 4 4 0 0 1 0 -8
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -8.0f,
          )
          // l 0.39 0.04
          lineToRelative(dx = 0.39f, dy = 0.04f)
          // l 0.86 0.11
          lineToRelative(dx = 0.86f, dy = 0.11f)
          // l 0.3 -0.66
          lineToRelative(dx = 0.3f, dy = -0.66f)
          // A 6 6 0 0 1 15 4
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 15.0f,
            y1 = 4.0f,
          )
          // a 8 8 0 0 1 1.73 0.21z
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.73f,
            dy1 = 0.21f,
          )
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
      .also { _vegetationAsset = it }
  }

@Suppress("ObjectPropertyName")
private var _vegetationAsset: ImageVector? = null
