// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Aperture: ImageVector
  get() {
    val current = _aperture
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Aperture",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 2 a14 14 0 1 0 14 14 A14 14 0 0 0 16 2 m11.84 12.14 L22 17.52 V5.62 a12 12 0 0 1 5.84 8.52 M12 18.68 v-5.36 L16 11 l4 2.31 v5.36 L16 21Z m8 -14 V11 l-9.66 -5.58 A12 12 0 0 1 20 4.7Z m-11.52 2 L14 9.85 4 15.62 a12 12 0 0 1 4.48 -8.96Z M4.16 17.85 10 14.47 v11.91 a12 12 0 0 1 -5.84 -8.53 M12 27.3 V21 l9.67 5.58 A12 12 0 0 1 16 28 a12 12 0 0 1 -4 -.7 m11.52 -2 L18 22.14 l10 -5.77 a12 12 0 0 1 -4.48 8.97Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // a 14 14 0 1 0 14 14
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 14.0f,
            dy1 = 14.0f,
          )
          // A 14 14 0 0 0 16 2
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 2.0f,
          )
          // m 11.84 12.14
          moveToRelative(dx = 11.84f, dy = 12.14f)
          // L 22 17.52
          lineTo(x = 22.0f, y = 17.52f)
          // V 5.62
          verticalLineTo(y = 5.62f)
          // a 12 12 0 0 1 5.84 8.52
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.84f,
            dy1 = 8.52f,
          )
          // M 12 18.68
          moveTo(x = 12.0f, y = 18.68f)
          // v -5.36
          verticalLineToRelative(dy = -5.36f)
          // L 16 11
          lineTo(x = 16.0f, y = 11.0f)
          // l 4 2.31
          lineToRelative(dx = 4.0f, dy = 2.31f)
          // v 5.36
          verticalLineToRelative(dy = 5.36f)
          // L 16 21z
          lineTo(x = 16.0f, y = 21.0f)
          close()
          // m 8 -14
          moveToRelative(dx = 8.0f, dy = -14.0f)
          // V 11
          verticalLineTo(y = 11.0f)
          // l -9.66 -5.58
          lineToRelative(dx = -9.66f, dy = -5.58f)
          // A 12 12 0 0 1 20 4.7z
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 20.0f,
            y1 = 4.7f,
          )
          close()
          // m -11.52 2
          moveToRelative(dx = -11.52f, dy = 2.0f)
          // L 14 9.85
          lineTo(x = 14.0f, y = 9.85f)
          // L 4 15.62
          lineTo(x = 4.0f, y = 15.62f)
          // a 12 12 0 0 1 4.48 -8.96z
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.48f,
            dy1 = -8.96f,
          )
          close()
          // M 4.16 17.85
          moveTo(x = 4.16f, y = 17.85f)
          // L 10 14.47
          lineTo(x = 10.0f, y = 14.47f)
          // v 11.91
          verticalLineToRelative(dy = 11.91f)
          // a 12 12 0 0 1 -5.84 -8.53
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.84f,
            dy1 = -8.53f,
          )
          // M 12 27.3
          moveTo(x = 12.0f, y = 27.3f)
          // V 21
          verticalLineTo(y = 21.0f)
          // l 9.67 5.58
          lineToRelative(dx = 9.67f, dy = 5.58f)
          // A 12 12 0 0 1 16 28
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 28.0f,
          )
          // a 12 12 0 0 1 -4 -0.7
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = -0.7f,
          )
          // m 11.52 -2
          moveToRelative(dx = 11.52f, dy = -2.0f)
          // L 18 22.14
          lineTo(x = 18.0f, y = 22.14f)
          // l 10 -5.77
          lineToRelative(dx = 10.0f, dy = -5.77f)
          // a 12 12 0 0 1 -4.48 8.97z
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.48f,
            dy1 = 8.97f,
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
      .also { _aperture = it }
  }

@Suppress("ObjectPropertyName")
private var _aperture: ImageVector? = null
