// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartAreaSmooth: ImageVector
  get() {
    val current = _chartAreaSmooth
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChartAreaSmooth",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m30 6.61 -1.32 .44 A21 21 0 0 1 23 8 c-1.73 0 -3.32 -.9 -5 -1.87 C16.16 5.08 14.27 4 12 4 9.12 4 5.91 6.2 4 7.77 V2 H2 v26 a2 2 0 0 0 2 2 h26Z M4 20.3 C5.87 17.38 9.56 13 12 13 c1.64 0 2.96 1.1 4.36 2.27 C17.9 16.55 19.64 18 22 18 a9.5 9.5 0 0 0 6 -2.53 v4.96 A13 13 0 0 1 22 22 a14 14 0 0 1 -4.68 -.95 A16 16 0 0 0 12 20 c-2.93 0 -6.07 2.96 -8 5.16Z M12 6 c1.73 0 3.32 .9 5 1.87 C18.84 8.92 20.73 10 23 10 a21 21 0 0 0 5 -.68 v3.32 c-.68 .8 -3.08 3.36 -6 3.36 -1.64 0 -2.96 -1.1 -4.36 -2.27 C16.1 12.45 14.36 11 12 11 c-2.94 0 -6.06 3.34 -8 5.84 v-6.42 C5.55 8.97 9.26 6 12 6 M4.25 28 c1.61 -2.1 5.16 -6 7.75 -6 a14 14 0 0 1 4.68 .95 A16 16 0 0 0 22 24 a15 15 0 0 0 6 -1.34 V28Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 6.61
          moveTo(x = 30.0f, y = 6.61f)
          // l -1.32 0.44
          lineToRelative(dx = -1.32f, dy = 0.44f)
          // A 21 21 0 0 1 23 8
          arcTo(
            horizontalEllipseRadius = 21.0f,
            verticalEllipseRadius = 21.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 23.0f,
            y1 = 8.0f,
          )
          // c -1.73 0 -3.32 -0.9 -5 -1.87
          curveToRelative(
            dx1 = -1.73f,
            dy1 = 0.0f,
            dx2 = -3.32f,
            dy2 = -0.9f,
            dx3 = -5.0f,
            dy3 = -1.87f,
          )
          // C 16.16 5.08 14.27 4 12 4
          curveTo(
            x1 = 16.16f,
            y1 = 5.08f,
            x2 = 14.27f,
            y2 = 4.0f,
            x3 = 12.0f,
            y3 = 4.0f,
          )
          // C 9.12 4 5.91 6.2 4 7.77
          curveTo(
            x1 = 9.12f,
            y1 = 4.0f,
            x2 = 5.91f,
            y2 = 6.2f,
            x3 = 4.0f,
            y3 = 7.77f,
          )
          // V 2
          verticalLineTo(y = 2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 26
          verticalLineToRelative(dy = 26.0f)
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
          // h 26z
          horizontalLineToRelative(dx = 26.0f)
          close()
          // M 4 20.3
          moveTo(x = 4.0f, y = 20.3f)
          // C 5.87 17.38 9.56 13 12 13
          curveTo(
            x1 = 5.87f,
            y1 = 17.38f,
            x2 = 9.56f,
            y2 = 13.0f,
            x3 = 12.0f,
            y3 = 13.0f,
          )
          // c 1.64 0 2.96 1.1 4.36 2.27
          curveToRelative(
            dx1 = 1.64f,
            dy1 = 0.0f,
            dx2 = 2.96f,
            dy2 = 1.1f,
            dx3 = 4.36f,
            dy3 = 2.27f,
          )
          // C 17.9 16.55 19.64 18 22 18
          curveTo(
            x1 = 17.9f,
            y1 = 16.55f,
            x2 = 19.64f,
            y2 = 18.0f,
            x3 = 22.0f,
            y3 = 18.0f,
          )
          // a 9.5 9.5 0 0 0 6 -2.53
          arcToRelative(
            a = 9.5f,
            b = 9.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 6.0f,
            dy1 = -2.53f,
          )
          // v 4.96
          verticalLineToRelative(dy = 4.96f)
          // A 13 13 0 0 1 22 22
          arcTo(
            horizontalEllipseRadius = 13.0f,
            verticalEllipseRadius = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 22.0f,
            y1 = 22.0f,
          )
          // a 14 14 0 0 1 -4.68 -0.95
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.68f,
            dy1 = -0.95f,
          )
          // A 16 16 0 0 0 12 20
          arcTo(
            horizontalEllipseRadius = 16.0f,
            verticalEllipseRadius = 16.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 12.0f,
            y1 = 20.0f,
          )
          // c -2.93 0 -6.07 2.96 -8 5.16z
          curveToRelative(
            dx1 = -2.93f,
            dy1 = 0.0f,
            dx2 = -6.07f,
            dy2 = 2.96f,
            dx3 = -8.0f,
            dy3 = 5.16f,
          )
          close()
          // M 12 6
          moveTo(x = 12.0f, y = 6.0f)
          // c 1.73 0 3.32 0.9 5 1.87
          curveToRelative(
            dx1 = 1.73f,
            dy1 = 0.0f,
            dx2 = 3.32f,
            dy2 = 0.9f,
            dx3 = 5.0f,
            dy3 = 1.87f,
          )
          // C 18.84 8.92 20.73 10 23 10
          curveTo(
            x1 = 18.84f,
            y1 = 8.92f,
            x2 = 20.73f,
            y2 = 10.0f,
            x3 = 23.0f,
            y3 = 10.0f,
          )
          // a 21 21 0 0 0 5 -0.68
          arcToRelative(
            a = 21.0f,
            b = 21.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.0f,
            dy1 = -0.68f,
          )
          // v 3.32
          verticalLineToRelative(dy = 3.32f)
          // c -0.68 0.8 -3.08 3.36 -6 3.36
          curveToRelative(
            dx1 = -0.68f,
            dy1 = 0.8f,
            dx2 = -3.08f,
            dy2 = 3.36f,
            dx3 = -6.0f,
            dy3 = 3.36f,
          )
          // c -1.64 0 -2.96 -1.1 -4.36 -2.27
          curveToRelative(
            dx1 = -1.64f,
            dy1 = 0.0f,
            dx2 = -2.96f,
            dy2 = -1.1f,
            dx3 = -4.36f,
            dy3 = -2.27f,
          )
          // C 16.1 12.45 14.36 11 12 11
          curveTo(
            x1 = 16.1f,
            y1 = 12.45f,
            x2 = 14.36f,
            y2 = 11.0f,
            x3 = 12.0f,
            y3 = 11.0f,
          )
          // c -2.94 0 -6.06 3.34 -8 5.84
          curveToRelative(
            dx1 = -2.94f,
            dy1 = 0.0f,
            dx2 = -6.06f,
            dy2 = 3.34f,
            dx3 = -8.0f,
            dy3 = 5.84f,
          )
          // v -6.42
          verticalLineToRelative(dy = -6.42f)
          // C 5.55 8.97 9.26 6 12 6
          curveTo(
            x1 = 5.55f,
            y1 = 8.97f,
            x2 = 9.26f,
            y2 = 6.0f,
            x3 = 12.0f,
            y3 = 6.0f,
          )
          // M 4.25 28
          moveTo(x = 4.25f, y = 28.0f)
          // c 1.61 -2.1 5.16 -6 7.75 -6
          curveToRelative(
            dx1 = 1.61f,
            dy1 = -2.1f,
            dx2 = 5.16f,
            dy2 = -6.0f,
            dx3 = 7.75f,
            dy3 = -6.0f,
          )
          // a 14 14 0 0 1 4.68 0.95
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.68f,
            dy1 = 0.95f,
          )
          // A 16 16 0 0 0 22 24
          arcTo(
            horizontalEllipseRadius = 16.0f,
            verticalEllipseRadius = 16.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 22.0f,
            y1 = 24.0f,
          )
          // a 15 15 0 0 0 6 -1.34
          arcToRelative(
            a = 15.0f,
            b = 15.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 6.0f,
            dy1 = -1.34f,
        )
        // V 28z
        verticalLineTo(y = 28.0f)
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
      .also { _chartAreaSmooth = it }
  }

@Suppress("ObjectPropertyName")
private var _chartAreaSmooth: ImageVector? = null
