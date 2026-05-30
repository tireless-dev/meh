// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChoroplethMap: ImageVector
  get() {
    val current = _choroplethMap
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChoroplethMap",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m29.24 4.03 -8 -2 a1 1 0 0 0 -.61 .04 l-9.7 3.88 -7.69 -1.92 A1 1 0 0 0 2 5 v22 a1 1 0 0 0 .76 .97 l8 2 L11 30 a1 1 0 0 0 .37 -.07 l9.7 -3.88 7.69 1.92 A1 1 0 0 0 30 27 V5 a1 1 0 0 0 -.76 -.97 M28 11 h-6 V4.28 l6 1.5Z m-18 8 H4 v-6 h6Z m2 -8 V7.68 l8 -3.2 V11Z m8 2 v6 h-8 v-6Z m-8 8 h8 v3.32 l-8 3.2Z m10 -8 h6 v6 h-6Z M10 7.78 V11 H4 V6.28Z M4 21 h6 v6.72 l-6 -1.5Z m18 3.22 V21 h6 v4.72Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.24 4.03
          moveTo(x = 29.24f, y = 4.03f)
          // l -8 -2
          lineToRelative(dx = -8.0f, dy = -2.0f)
          // a 1 1 0 0 0 -0.61 0.04
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.61f,
            dy1 = 0.04f,
          )
          // l -9.7 3.88
          lineToRelative(dx = -9.7f, dy = 3.88f)
          // l -7.69 -1.92
          lineToRelative(dx = -7.69f, dy = -1.92f)
          // A 1 1 0 0 0 2 5
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.0f,
            y1 = 5.0f,
          )
          // v 22
          verticalLineToRelative(dy = 22.0f)
          // a 1 1 0 0 0 0.76 0.97
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.76f,
            dy1 = 0.97f,
          )
          // l 8 2
          lineToRelative(dx = 8.0f, dy = 2.0f)
          // L 11 30
          lineTo(x = 11.0f, y = 30.0f)
          // a 1 1 0 0 0 0.37 -0.07
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.37f,
            dy1 = -0.07f,
          )
          // l 9.7 -3.88
          lineToRelative(dx = 9.7f, dy = -3.88f)
          // l 7.69 1.92
          lineToRelative(dx = 7.69f, dy = 1.92f)
          // A 1 1 0 0 0 30 27
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 30.0f,
            y1 = 27.0f,
          )
          // V 5
          verticalLineTo(y = 5.0f)
          // a 1 1 0 0 0 -0.76 -0.97
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.76f,
            dy1 = -0.97f,
          )
          // M 28 11
          moveTo(x = 28.0f, y = 11.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // V 4.28
          verticalLineTo(y = 4.28f)
          // l 6 1.5z
          lineToRelative(dx = 6.0f, dy = 1.5f)
          close()
          // m -18 8
          moveToRelative(dx = -18.0f, dy = 8.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
          close()
          // m 2 -8
          moveToRelative(dx = 2.0f, dy = -8.0f)
          // V 7.68
          verticalLineTo(y = 7.68f)
          // l 8 -3.2
          lineToRelative(dx = 8.0f, dy = -3.2f)
          // V 11z
          verticalLineTo(y = 11.0f)
          close()
          // m 8 2
          moveToRelative(dx = 8.0f, dy = 2.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v -6z
          verticalLineToRelative(dy = -6.0f)
          close()
          // m -8 8
          moveToRelative(dx = -8.0f, dy = 8.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 3.32
          verticalLineToRelative(dy = 3.32f)
          // l -8 3.2z
          lineToRelative(dx = -8.0f, dy = 3.2f)
          close()
          // m 10 -8
          moveToRelative(dx = 10.0f, dy = -8.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
          // M 10 7.78
          moveTo(x = 10.0f, y = 7.78f)
          // V 11
          verticalLineTo(y = 11.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 6.28z
          verticalLineTo(y = 6.28f)
          close()
          // M 4 21
          moveTo(x = 4.0f, y = 21.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 6.72
          verticalLineToRelative(dy = 6.72f)
          // l -6 -1.5z
          lineToRelative(dx = -6.0f, dy = -1.5f)
          close()
          // m 18 3.22
          moveToRelative(dx = 18.0f, dy = 3.22f)
          // V 21
          verticalLineTo(y = 21.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 4.72z
          verticalLineToRelative(dy = 4.72f)
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
      .also { _choroplethMap = it }
  }

@Suppress("ObjectPropertyName")
private var _choroplethMap: ImageVector? = null
