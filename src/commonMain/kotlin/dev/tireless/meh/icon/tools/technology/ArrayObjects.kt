// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrayObjects: ImageVector
  get() {
    val current = _arrayObjects
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ArrayObjects",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M10 7 h3 v2 h-3 v4 c0 1.2 -.54 2.27 -1.38 3 A4 4 0 0 1 10 19 v4 h3 v2 h-3 a2 2 0 0 1 -2 -2 v-4 a2 2 0 0 0 -2 -2 v-2 a2 2 0 0 0 2 -2 V9 a2 2 0 0 1 2 -2 m14 6 V9 a2 2 0 0 0 -2 -2 h-3 v2 h3 v4 c0 1.2 .54 2.27 1.38 3 A4 4 0 0 0 22 19 v4 h-3 v2 h3 a2 2 0 0 0 2 -2 v-4 a2 2 0 0 1 2 -2 v-2 a2 2 0 0 1 -2 -2 M2 4 v4 h2 V4 h4 V2 H4 a2 2 0 0 0 -2 2 m26 -2 h-4 v2 h4 v4 h2 V4 a2 2 0 0 0 -2 -2 M4 28 v-4 H2 v4 a2 2 0 0 0 2 2 h4 v-2z m24 -4 v4 h-4 v2 h4 a2 2 0 0 0 2 -2 v-4z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 7
          moveTo(x = 10.0f, y = 7.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // c 0 1.2 -0.54 2.27 -1.38 3
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 1.2f,
            dx2 = -0.54f,
            dy2 = 2.27f,
            dx3 = -1.38f,
            dy3 = 3.0f,
          )
          // A 4 4 0 0 1 10 19
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 10.0f,
            y1 = 19.0f,
          )
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
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
          // v -4
          verticalLineToRelative(dy = -4.0f)
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
          // v -2
          verticalLineToRelative(dy = -2.0f)
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
          // V 9
          verticalLineTo(y = 9.0f)
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
          // m 14 6
          moveToRelative(dx = 14.0f, dy = 6.0f)
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
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // c 0 1.2 0.54 2.27 1.38 3
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 1.2f,
            dx2 = 0.54f,
            dy2 = 2.27f,
            dx3 = 1.38f,
            dy3 = 3.0f,
          )
          // A 4 4 0 0 0 22 19
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 22.0f,
            y1 = 19.0f,
          )
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
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
          // v -4
          verticalLineToRelative(dy = -4.0f)
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
          // v -2
          verticalLineToRelative(dy = -2.0f)
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
          // M 2 4
          moveTo(x = 2.0f, y = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // V 2
          verticalLineTo(y = 2.0f)
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
          // m 26 -2
          moveToRelative(dx = 26.0f, dy = -2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 4
          verticalLineTo(y = 4.0f)
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
          // M 4 28
          moveTo(x = 4.0f, y = 28.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
          // m 24 -4
          moveToRelative(dx = 24.0f, dy = -4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
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
          // v -4z
          verticalLineToRelative(dy = -4.0f)
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
      .also { _arrayObjects = it }
  }

@Suppress("ObjectPropertyName")
private var _arrayObjects: ImageVector? = null
