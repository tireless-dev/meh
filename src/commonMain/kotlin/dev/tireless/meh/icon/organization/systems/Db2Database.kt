// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Db2Database: ImageVector
  get() {
    val current = _db2Database
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Db2Database",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 3 C10.7 3 5 4.25 5 7 v18 c0 2.75 5.7 4 11 4 s11 -1.25 11 -4 V7 c0 -2.75 -5.7 -4 -11 -4 m0 2 c5.8 0 8.8 1.43 9 2 -.2 .57 -3.2 2 -9 2 -5.84 0 -8.84 -1.46 -9 -1.98 C7.16 6.45 10.16 5 16 5 M7 9.43 C9.13 10.5 12.64 11 16 11 s6.87 -.5 9 -1.57 v3.56 C24.84 13.54 21.84 15 16 15 s-8.85 -1.46 -9 -2z m0 6 C9.13 16.5 12.64 17 16 17 s6.87 -.5 9 -1.57 v3.56 C24.84 19.54 21.84 21 16 21 s-8.85 -1.46 -9 -2z M16 27 c-5.85 0 -8.85 -1.46 -9 -2 v-3.57 C9.13 22.5 12.64 23 16 23 s6.87 -.5 9 -1.57 v3.56 C24.84 25.54 21.84 27 16 27
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 3
          moveTo(x = 16.0f, y = 3.0f)
          // C 10.7 3 5 4.25 5 7
          curveTo(
            x1 = 10.7f,
            y1 = 3.0f,
            x2 = 5.0f,
            y2 = 4.25f,
            x3 = 5.0f,
            y3 = 7.0f,
          )
          // v 18
          verticalLineToRelative(dy = 18.0f)
          // c 0 2.75 5.7 4 11 4
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 2.75f,
            dx2 = 5.7f,
            dy2 = 4.0f,
            dx3 = 11.0f,
            dy3 = 4.0f,
          )
          // s 11 -1.25 11 -4
          reflectiveCurveToRelative(
            dx1 = 11.0f,
            dy1 = -1.25f,
            dx2 = 11.0f,
            dy2 = -4.0f,
          )
          // V 7
          verticalLineTo(y = 7.0f)
          // c 0 -2.75 -5.7 -4 -11 -4
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -2.75f,
            dx2 = -5.7f,
            dy2 = -4.0f,
            dx3 = -11.0f,
            dy3 = -4.0f,
          )
          // m 0 2
          moveToRelative(dx = 0.0f, dy = 2.0f)
          // c 5.8 0 8.8 1.43 9 2
          curveToRelative(
            dx1 = 5.8f,
            dy1 = 0.0f,
            dx2 = 8.8f,
            dy2 = 1.43f,
            dx3 = 9.0f,
            dy3 = 2.0f,
          )
          // c -0.2 0.57 -3.2 2 -9 2
          curveToRelative(
            dx1 = -0.2f,
            dy1 = 0.57f,
            dx2 = -3.2f,
            dy2 = 2.0f,
            dx3 = -9.0f,
            dy3 = 2.0f,
          )
          // c -5.84 0 -8.84 -1.46 -9 -1.98
          curveToRelative(
            dx1 = -5.84f,
            dy1 = 0.0f,
            dx2 = -8.84f,
            dy2 = -1.46f,
            dx3 = -9.0f,
            dy3 = -1.98f,
          )
          // C 7.16 6.45 10.16 5 16 5
          curveTo(
            x1 = 7.16f,
            y1 = 6.45f,
            x2 = 10.16f,
            y2 = 5.0f,
            x3 = 16.0f,
            y3 = 5.0f,
          )
          // M 7 9.43
          moveTo(x = 7.0f, y = 9.43f)
          // C 9.13 10.5 12.64 11 16 11
          curveTo(
            x1 = 9.13f,
            y1 = 10.5f,
            x2 = 12.64f,
            y2 = 11.0f,
            x3 = 16.0f,
            y3 = 11.0f,
          )
          // s 6.87 -0.5 9 -1.57
          reflectiveCurveToRelative(
            dx1 = 6.87f,
            dy1 = -0.5f,
            dx2 = 9.0f,
            dy2 = -1.57f,
          )
          // v 3.56
          verticalLineToRelative(dy = 3.56f)
          // C 24.84 13.54 21.84 15 16 15
          curveTo(
            x1 = 24.84f,
            y1 = 13.54f,
            x2 = 21.84f,
            y2 = 15.0f,
            x3 = 16.0f,
            y3 = 15.0f,
          )
          // s -8.85 -1.46 -9 -2z
          reflectiveCurveToRelative(
            dx1 = -8.85f,
            dy1 = -1.46f,
            dx2 = -9.0f,
            dy2 = -2.0f,
          )
          close()
          // m 0 6
          moveToRelative(dx = 0.0f, dy = 6.0f)
          // C 9.13 16.5 12.64 17 16 17
          curveTo(
            x1 = 9.13f,
            y1 = 16.5f,
            x2 = 12.64f,
            y2 = 17.0f,
            x3 = 16.0f,
            y3 = 17.0f,
          )
          // s 6.87 -0.5 9 -1.57
          reflectiveCurveToRelative(
            dx1 = 6.87f,
            dy1 = -0.5f,
            dx2 = 9.0f,
            dy2 = -1.57f,
          )
          // v 3.56
          verticalLineToRelative(dy = 3.56f)
          // C 24.84 19.54 21.84 21 16 21
          curveTo(
            x1 = 24.84f,
            y1 = 19.54f,
            x2 = 21.84f,
            y2 = 21.0f,
            x3 = 16.0f,
            y3 = 21.0f,
          )
          // s -8.85 -1.46 -9 -2z
          reflectiveCurveToRelative(
            dx1 = -8.85f,
            dy1 = -1.46f,
            dx2 = -9.0f,
            dy2 = -2.0f,
          )
          close()
          // M 16 27
          moveTo(x = 16.0f, y = 27.0f)
          // c -5.85 0 -8.85 -1.46 -9 -2
          curveToRelative(
            dx1 = -5.85f,
            dy1 = 0.0f,
            dx2 = -8.85f,
            dy2 = -1.46f,
            dx3 = -9.0f,
            dy3 = -2.0f,
          )
          // v -3.57
          verticalLineToRelative(dy = -3.57f)
          // C 9.13 22.5 12.64 23 16 23
          curveTo(
            x1 = 9.13f,
            y1 = 22.5f,
            x2 = 12.64f,
            y2 = 23.0f,
            x3 = 16.0f,
            y3 = 23.0f,
          )
          // s 6.87 -0.5 9 -1.57
          reflectiveCurveToRelative(
            dx1 = 6.87f,
            dy1 = -0.5f,
            dx2 = 9.0f,
            dy2 = -1.57f,
          )
          // v 3.56
          verticalLineToRelative(dy = 3.56f)
          // C 24.84 25.54 21.84 27 16 27
          curveTo(
            x1 = 24.84f,
            y1 = 25.54f,
            x2 = 21.84f,
            y2 = 27.0f,
            x3 = 16.0f,
            y3 = 27.0f,
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
      .also { _db2Database = it }
  }

@Suppress("ObjectPropertyName")
private var _db2Database: ImageVector? = null
