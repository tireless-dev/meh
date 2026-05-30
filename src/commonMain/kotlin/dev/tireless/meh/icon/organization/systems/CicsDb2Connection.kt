// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CicsDb2Connection: ImageVector
  get() {
    val current = _cicsDb2Connection
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CicsDb2Connection",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M22.5 30 a3.5 3.5 0 0 1 -2.48 -5.97 l1.42 1.41 a1.5 1.5 0 0 0 2.12 2.12 l5 -5 a1.5 1.5 0 0 0 -2.12 -2.12 l-1.42 -1.41 a3.5 3.5 0 0 1 4.95 4.95 l-5 5 A3.5 3.5 0 0 1 22.5 30
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22.5 30
          moveTo(x = 22.5f, y = 30.0f)
          // a 3.5 3.5 0 0 1 -2.48 -5.97
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.48f,
            dy1 = -5.97f,
          )
          // l 1.42 1.41
          lineToRelative(dx = 1.42f, dy = 1.41f)
          // a 1.5 1.5 0 0 0 2.12 2.12
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.12f,
            dy1 = 2.12f,
          )
          // l 5 -5
          lineToRelative(dx = 5.0f, dy = -5.0f)
          // a 1.5 1.5 0 0 0 -2.12 -2.12
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.12f,
            dy1 = -2.12f,
          )
          // l -1.42 -1.41
          lineToRelative(dx = -1.42f, dy = -1.41f)
          // a 3.5 3.5 0 0 1 4.95 4.95
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.95f,
            dy1 = 4.95f,
          )
          // l -5 5
          lineToRelative(dx = -5.0f, dy = 5.0f)
          // A 3.5 3.5 0 0 1 22.5 30
          arcTo(
            horizontalEllipseRadius = 3.5f,
            verticalEllipseRadius = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 22.5f,
            y1 = 30.0f,
          )
        }
        // M16.5 31 a3.5 3.5 0 0 1 -2.48 -5.97 l5 -5 a3.5 3.5 0 0 1 4.95 4.95 l-1.4 -1.42 a1.5 1.5 0 0 0 -2.12 -2.12 l-5.01 5 a1.5 1.5 0 0 0 2.12 2.12 l1.42 1.41 A3.5 3.5 0 0 1 16.5 31 M16 2 C10.7 2 5 3.25 5 6 v18 c0 1.68 2.13 2.8 5 3.42 v-2.05 C8 24.9 7.05 24.23 7 24 v-3.57 c1.5 .75 3.67 1.21 6 1.43 v-2 C9.12 19.48 7.12 18.44 7 18 v-3.57 C9.13 15.5 12.64 16 16 16 c5.3 0 11 -1.25 11 -4 V6 c0 -2.75 -5.7 -4 -11 -4 M7 6.02 C7.15 5.46 10.15 4 16 4 c5.8 0 8.8 1.43 9 2 -.2 .57 -3.2 2 -9 2 -5.85 0 -8.85 -1.46 -9 -1.98 m18 5.97 C24.84 12.54 21.84 14 16 14 s-8.85 -1.46 -9 -2 V8.43 C9.13 9.5 12.64 10 16 10 s6.87 -.5 9 -1.57z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16.5 31
          moveTo(x = 16.5f, y = 31.0f)
          // a 3.5 3.5 0 0 1 -2.48 -5.97
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.48f,
            dy1 = -5.97f,
          )
          // l 5 -5
          lineToRelative(dx = 5.0f, dy = -5.0f)
          // a 3.5 3.5 0 0 1 4.95 4.95
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.95f,
            dy1 = 4.95f,
          )
          // l -1.4 -1.42
          lineToRelative(dx = -1.4f, dy = -1.42f)
          // a 1.5 1.5 0 0 0 -2.12 -2.12
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.12f,
            dy1 = -2.12f,
          )
          // l -5.01 5
          lineToRelative(dx = -5.01f, dy = 5.0f)
          // a 1.5 1.5 0 0 0 2.12 2.12
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.12f,
            dy1 = 2.12f,
          )
          // l 1.42 1.41
          lineToRelative(dx = 1.42f, dy = 1.41f)
          // A 3.5 3.5 0 0 1 16.5 31
          arcTo(
            horizontalEllipseRadius = 3.5f,
            verticalEllipseRadius = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.5f,
            y1 = 31.0f,
          )
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // C 10.7 2 5 3.25 5 6
          curveTo(
            x1 = 10.7f,
            y1 = 2.0f,
            x2 = 5.0f,
            y2 = 3.25f,
            x3 = 5.0f,
            y3 = 6.0f,
          )
          // v 18
          verticalLineToRelative(dy = 18.0f)
          // c 0 1.68 2.13 2.8 5 3.42
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 1.68f,
            dx2 = 2.13f,
            dy2 = 2.8f,
            dx3 = 5.0f,
            dy3 = 3.42f,
          )
          // v -2.05
          verticalLineToRelative(dy = -2.05f)
          // C 8 24.9 7.05 24.23 7 24
          curveTo(
            x1 = 8.0f,
            y1 = 24.9f,
            x2 = 7.05f,
            y2 = 24.23f,
            x3 = 7.0f,
            y3 = 24.0f,
          )
          // v -3.57
          verticalLineToRelative(dy = -3.57f)
          // c 1.5 0.75 3.67 1.21 6 1.43
          curveToRelative(
            dx1 = 1.5f,
            dy1 = 0.75f,
            dx2 = 3.67f,
            dy2 = 1.21f,
            dx3 = 6.0f,
            dy3 = 1.43f,
          )
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // C 9.12 19.48 7.12 18.44 7 18
          curveTo(
            x1 = 9.12f,
            y1 = 19.48f,
            x2 = 7.12f,
            y2 = 18.44f,
            x3 = 7.0f,
            y3 = 18.0f,
          )
          // v -3.57
          verticalLineToRelative(dy = -3.57f)
          // C 9.13 15.5 12.64 16 16 16
          curveTo(
            x1 = 9.13f,
            y1 = 15.5f,
            x2 = 12.64f,
            y2 = 16.0f,
            x3 = 16.0f,
            y3 = 16.0f,
          )
          // c 5.3 0 11 -1.25 11 -4
          curveToRelative(
            dx1 = 5.3f,
            dy1 = 0.0f,
            dx2 = 11.0f,
            dy2 = -1.25f,
            dx3 = 11.0f,
            dy3 = -4.0f,
          )
          // V 6
          verticalLineTo(y = 6.0f)
          // c 0 -2.75 -5.7 -4 -11 -4
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -2.75f,
            dx2 = -5.7f,
            dy2 = -4.0f,
            dx3 = -11.0f,
            dy3 = -4.0f,
          )
          // M 7 6.02
          moveTo(x = 7.0f, y = 6.02f)
          // C 7.15 5.46 10.15 4 16 4
          curveTo(
            x1 = 7.15f,
            y1 = 5.46f,
            x2 = 10.15f,
            y2 = 4.0f,
            x3 = 16.0f,
            y3 = 4.0f,
          )
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
          // c -5.85 0 -8.85 -1.46 -9 -1.98
          curveToRelative(
            dx1 = -5.85f,
            dy1 = 0.0f,
            dx2 = -8.85f,
            dy2 = -1.46f,
            dx3 = -9.0f,
            dy3 = -1.98f,
          )
          // m 18 5.97
          moveToRelative(dx = 18.0f, dy = 5.97f)
          // C 24.84 12.54 21.84 14 16 14
          curveTo(
            x1 = 24.84f,
            y1 = 12.54f,
            x2 = 21.84f,
            y2 = 14.0f,
            x3 = 16.0f,
            y3 = 14.0f,
          )
          // s -8.85 -1.46 -9 -2
          reflectiveCurveToRelative(
            dx1 = -8.85f,
            dy1 = -1.46f,
            dx2 = -9.0f,
            dy2 = -2.0f,
          )
          // V 8.43
          verticalLineTo(y = 8.43f)
          // C 9.13 9.5 12.64 10 16 10
          curveTo(
            x1 = 9.13f,
            y1 = 9.5f,
            x2 = 12.64f,
            y2 = 10.0f,
            x3 = 16.0f,
            y3 = 10.0f,
          )
          // s 6.87 -0.5 9 -1.57z
          reflectiveCurveToRelative(
            dx1 = 6.87f,
            dy1 = -0.5f,
            dx2 = 9.0f,
            dy2 = -1.57f,
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
      .also { _cicsDb2Connection = it }
  }

@Suppress("ObjectPropertyName")
private var _cicsDb2Connection: ImageVector? = null
