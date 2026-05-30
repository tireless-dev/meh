// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BootVolume: ImageVector
  get() {
    val current = _bootVolume
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.BootVolume",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M32 22 v-2 h-3 v-2 h-2 v2 h-1 v2 h1 v6 a2 2 0 0 0 2 2 h3 v-2 h-3 v-6z m-9 8 h-3 a2 2 0 0 1 -2 -2 v-6 a2 2 0 0 1 2 -2 h3 a2 2 0 0 1 2 2 v6 a2 2 0 0 1 -2 2 m-3 -8 v6 h3 v-6z m-6 8 h-3 a2 2 0 0 1 -2 -2 v-6 a2 2 0 0 1 2 -2 h3 a2 2 0 0 1 2 2 v6 a2 2 0 0 1 -2 2 m-3 -8 v6 h3 v-6z m-6 -2 H2 v-4 H0 v14 h5 a2 2 0 0 0 2 -2 v-6 a2 2 0 0 0 -2 -2 m-3 8 v-6 h3 v6z m2 -14 V5 h7.59 l4 4 H28 v7 h2 V9 a2 2 0 0 0 -2 -2 H16.41 L13 3.59 A2 2 0 0 0 11.59 3 H4 a2 2 0 0 0 -2 2 v9z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 32 22
          moveTo(x = 32.0f, y = 22.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v -6z
          verticalLineToRelative(dy = -6.0f)
          close()
          // m -9 8
          moveToRelative(dx = -9.0f, dy = 8.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
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
          // v -6
          verticalLineToRelative(dy = -6.0f)
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
          // h 3
          horizontalLineToRelative(dx = 3.0f)
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
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
          // m -3 -8
          moveToRelative(dx = -3.0f, dy = -8.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v -6z
          verticalLineToRelative(dy = -6.0f)
          close()
          // m -6 8
          moveToRelative(dx = -6.0f, dy = 8.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
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
          // v -6
          verticalLineToRelative(dy = -6.0f)
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
          // h 3
          horizontalLineToRelative(dx = 3.0f)
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
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
          // m -3 -8
          moveToRelative(dx = -3.0f, dy = -8.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v -6z
          verticalLineToRelative(dy = -6.0f)
          close()
          // m -6 -2
          moveToRelative(dx = -6.0f, dy = -2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // H 0
          horizontalLineTo(x = 0.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
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
          // v -6
          verticalLineToRelative(dy = -6.0f)
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
          // m -3 8
          moveToRelative(dx = -3.0f, dy = 8.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 6z
          verticalLineToRelative(dy = 6.0f)
          close()
          // m 2 -14
          moveToRelative(dx = 2.0f, dy = -14.0f)
          // V 5
          verticalLineTo(y = 5.0f)
          // h 7.59
          horizontalLineToRelative(dx = 7.59f)
          // l 4 4
          lineToRelative(dx = 4.0f, dy = 4.0f)
          // H 28
          horizontalLineTo(x = 28.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 9
          verticalLineTo(y = 9.0f)
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
          // H 16.41
          horizontalLineTo(x = 16.41f)
          // L 13 3.59
          lineTo(x = 13.0f, y = 3.59f)
          // A 2 2 0 0 0 11.59 3
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 11.59f,
            y1 = 3.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
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
          // v 9z
          verticalLineToRelative(dy = 9.0f)
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
      .also { _bootVolume = it }
  }

@Suppress("ObjectPropertyName")
private var _bootVolume: ImageVector? = null
