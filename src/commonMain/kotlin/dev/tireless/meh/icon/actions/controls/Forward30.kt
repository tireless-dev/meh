// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Forward30: ImageVector
  get() {
    val current = _forward30
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Forward30",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 18 A10 10 0 1 1 16 8 h4 v5 l6 -6 -6 -6 v5 h-4 a12 12 0 1 0 12 12Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 18
          moveTo(x = 26.0f, y = 18.0f)
          // A 10 10 0 1 1 16 8
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 8.0f,
          )
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // l 6 -6
          lineToRelative(dx = 6.0f, dy = -6.0f)
          // l -6 -6
          lineToRelative(dx = -6.0f, dy = -6.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // a 12 12 0 1 0 12 12z
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 12.0f,
            dy1 = 12.0f,
          )
          close()
        }
        // M19.64 22.13 a3 3 0 0 1 -1.28 -.27 2.4 2.4 0 0 1 -.89 -.77 A3 3 0 0 1 17 19.84 a7 7 0 0 1 -.17 -1.68 A7 7 0 0 1 17 16.48 a4 4 0 0 1 .52 -1.25 2.4 2.4 0 0 1 .89 -.77 3 3 0 0 1 1.28 -.27 2.4 2.4 0 0 1 2.16 1 5.3 5.3 0 0 1 .7 2.93 5.3 5.3 0 0 1 -.7 2.93 2.4 2.4 0 0 1 -2.21 1.08 m0 -1.22 a1 1 0 0 0 1 -.55 3 3 0 0 0 .3 -1.51 v-1.38 a3 3 0 0 0 -.3 -1.5 1.22 1.22 0 0 0 -2.05 0 3 3 0 0 0 -.29 1.5 v1.38 a3 3 0 0 0 .29 1.51 1 1 0 0 0 1.05 .55 m-7.02 -3.49 a1.5 1.5 0 0 0 1 -.27 .8 .8 0 0 0 .31 -.68 v-.08 a1 1 0 0 0 -.3 -.74 1.2 1.2 0 0 0 -.83 -.27 1.7 1.7 0 0 0 -.89 .24 2 2 0 0 0 -.68 .68 l-.93 -.83 a5 5 0 0 1 .44 -.51 3 3 0 0 1 .54 -.4 3 3 0 0 1 .7 -.27 3 3 0 0 1 .87 -.1 4 4 0 0 1 1.06 .14 2 2 0 0 1 .82 .4 2 2 0 0 1 .54 .63 2 2 0 0 1 .18 .83 2 2 0 0 1 -.11 .67 2 2 0 0 1 -.32 .52 2 2 0 0 1 -.47 .36 2 2 0 0 1 -.57 .2 V18 a2 2 0 0 1 .63 .21 2 2 0 0 1 .51 .38 2 2 0 0 1 .34 .55 2 2 0 0 1 .12 .73 2 2 0 0 1 -.2 .92 2 2 0 0 1 -.58 .72 3 3 0 0 1 -.89 .45 4 4 0 0 1 -1.15 .16 4 4 0 0 1 -1 -.11 A3 3 0 0 1 11 21.7 a3 3 0 0 1 -.56 -.45 A4 4 0 0 1 10 20.7 l1.07 -.81 a3 3 0 0 0 .28 .42 2 2 0 0 0 .36 .34 2 2 0 0 0 .45 .22 2 2 0 0 0 .57 .07 1.5 1.5 0 0 0 1 -.3 1.1 1.1 0 0 0 .34 -.85 v-.08 a1 1 0 0 0 -.37 -.8 2 2 0 0 0 -1.06 -.28 h-.76 v-1.21Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19.64 22.13
          moveTo(x = 19.64f, y = 22.13f)
          // a 3 3 0 0 1 -1.28 -0.27
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.28f,
            dy1 = -0.27f,
          )
          // a 2.4 2.4 0 0 1 -0.89 -0.77
          arcToRelative(
            a = 2.4f,
            b = 2.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.89f,
            dy1 = -0.77f,
          )
          // A 3 3 0 0 1 17 19.84
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 17.0f,
            y1 = 19.84f,
          )
          // a 7 7 0 0 1 -0.17 -1.68
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.17f,
            dy1 = -1.68f,
          )
          // A 7 7 0 0 1 17 16.48
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 17.0f,
            y1 = 16.48f,
          )
          // a 4 4 0 0 1 0.52 -1.25
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.52f,
            dy1 = -1.25f,
          )
          // a 2.4 2.4 0 0 1 0.89 -0.77
          arcToRelative(
            a = 2.4f,
            b = 2.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.89f,
            dy1 = -0.77f,
          )
          // a 3 3 0 0 1 1.28 -0.27
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.28f,
            dy1 = -0.27f,
          )
          // a 2.4 2.4 0 0 1 2.16 1
          arcToRelative(
            a = 2.4f,
            b = 2.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.16f,
            dy1 = 1.0f,
          )
          // a 5.3 5.3 0 0 1 0.7 2.93
          arcToRelative(
            a = 5.3f,
            b = 5.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.7f,
            dy1 = 2.93f,
          )
          // a 5.3 5.3 0 0 1 -0.7 2.93
          arcToRelative(
            a = 5.3f,
            b = 5.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.7f,
            dy1 = 2.93f,
          )
          // a 2.4 2.4 0 0 1 -2.21 1.08
          arcToRelative(
            a = 2.4f,
            b = 2.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.21f,
            dy1 = 1.08f,
          )
          // m 0 -1.22
          moveToRelative(dx = 0.0f, dy = -1.22f)
          // a 1 1 0 0 0 1 -0.55
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -0.55f,
          )
          // a 3 3 0 0 0 0.3 -1.51
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.3f,
            dy1 = -1.51f,
          )
          // v -1.38
          verticalLineToRelative(dy = -1.38f)
          // a 3 3 0 0 0 -0.3 -1.5
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.3f,
            dy1 = -1.5f,
          )
          // a 1.22 1.22 0 0 0 -2.05 0
          arcToRelative(
            a = 1.22f,
            b = 1.22f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.05f,
            dy1 = 0.0f,
          )
          // a 3 3 0 0 0 -0.29 1.5
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.29f,
            dy1 = 1.5f,
          )
          // v 1.38
          verticalLineToRelative(dy = 1.38f)
          // a 3 3 0 0 0 0.29 1.51
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.29f,
            dy1 = 1.51f,
          )
          // a 1 1 0 0 0 1.05 0.55
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.05f,
            dy1 = 0.55f,
          )
          // m -7.02 -3.49
          moveToRelative(dx = -7.02f, dy = -3.49f)
          // a 1.5 1.5 0 0 0 1 -0.27
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -0.27f,
          )
          // a 0.8 0.8 0 0 0 0.31 -0.68
          arcToRelative(
            a = 0.8f,
            b = 0.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.31f,
            dy1 = -0.68f,
          )
          // v -0.08
          verticalLineToRelative(dy = -0.08f)
          // a 1 1 0 0 0 -0.3 -0.74
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.3f,
            dy1 = -0.74f,
          )
          // a 1.2 1.2 0 0 0 -0.83 -0.27
          arcToRelative(
            a = 1.2f,
            b = 1.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.83f,
            dy1 = -0.27f,
          )
          // a 1.7 1.7 0 0 0 -0.89 0.24
          arcToRelative(
            a = 1.7f,
            b = 1.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.89f,
            dy1 = 0.24f,
          )
          // a 2 2 0 0 0 -0.68 0.68
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.68f,
            dy1 = 0.68f,
          )
          // l -0.93 -0.83
          lineToRelative(dx = -0.93f, dy = -0.83f)
          // a 5 5 0 0 1 0.44 -0.51
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.44f,
            dy1 = -0.51f,
          )
          // a 3 3 0 0 1 0.54 -0.4
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.54f,
            dy1 = -0.4f,
          )
          // a 3 3 0 0 1 0.7 -0.27
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.7f,
            dy1 = -0.27f,
          )
          // a 3 3 0 0 1 0.87 -0.1
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.87f,
            dy1 = -0.1f,
          )
          // a 4 4 0 0 1 1.06 0.14
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.06f,
            dy1 = 0.14f,
          )
          // a 2 2 0 0 1 0.82 0.4
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.82f,
            dy1 = 0.4f,
          )
          // a 2 2 0 0 1 0.54 0.63
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.54f,
            dy1 = 0.63f,
          )
          // a 2 2 0 0 1 0.18 0.83
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.18f,
            dy1 = 0.83f,
          )
          // a 2 2 0 0 1 -0.11 0.67
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.11f,
            dy1 = 0.67f,
          )
          // a 2 2 0 0 1 -0.32 0.52
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.32f,
            dy1 = 0.52f,
          )
          // a 2 2 0 0 1 -0.47 0.36
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.47f,
            dy1 = 0.36f,
          )
          // a 2 2 0 0 1 -0.57 0.2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.57f,
            dy1 = 0.2f,
          )
          // V 18
          verticalLineTo(y = 18.0f)
          // a 2 2 0 0 1 0.63 0.21
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.63f,
            dy1 = 0.21f,
          )
          // a 2 2 0 0 1 0.51 0.38
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.51f,
            dy1 = 0.38f,
          )
          // a 2 2 0 0 1 0.34 0.55
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.34f,
            dy1 = 0.55f,
          )
          // a 2 2 0 0 1 0.12 0.73
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.12f,
            dy1 = 0.73f,
          )
          // a 2 2 0 0 1 -0.2 0.92
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.2f,
            dy1 = 0.92f,
          )
          // a 2 2 0 0 1 -0.58 0.72
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.58f,
            dy1 = 0.72f,
          )
          // a 3 3 0 0 1 -0.89 0.45
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.89f,
            dy1 = 0.45f,
          )
          // a 4 4 0 0 1 -1.15 0.16
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.15f,
            dy1 = 0.16f,
          )
          // a 4 4 0 0 1 -1 -0.11
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = -0.11f,
          )
          // A 3 3 0 0 1 11 21.7
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 11.0f,
            y1 = 21.7f,
          )
          // a 3 3 0 0 1 -0.56 -0.45
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.56f,
            dy1 = -0.45f,
          )
          // A 4 4 0 0 1 10 20.7
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 10.0f,
            y1 = 20.7f,
          )
          // l 1.07 -0.81
          lineToRelative(dx = 1.07f, dy = -0.81f)
          // a 3 3 0 0 0 0.28 0.42
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.28f,
            dy1 = 0.42f,
          )
          // a 2 2 0 0 0 0.36 0.34
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.36f,
            dy1 = 0.34f,
          )
          // a 2 2 0 0 0 0.45 0.22
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.45f,
            dy1 = 0.22f,
          )
          // a 2 2 0 0 0 0.57 0.07
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.57f,
            dy1 = 0.07f,
          )
          // a 1.5 1.5 0 0 0 1 -0.3
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -0.3f,
          )
          // a 1.1 1.1 0 0 0 0.34 -0.85
          arcToRelative(
            a = 1.1f,
            b = 1.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.34f,
            dy1 = -0.85f,
          )
          // v -0.08
          verticalLineToRelative(dy = -0.08f)
          // a 1 1 0 0 0 -0.37 -0.8
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.37f,
            dy1 = -0.8f,
          )
          // a 2 2 0 0 0 -1.06 -0.28
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.06f,
            dy1 = -0.28f,
          )
          // h -0.76
          horizontalLineToRelative(dx = -0.76f)
          // v -1.21z
          verticalLineToRelative(dy = -1.21f)
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
      .also { _forward30 = it }
  }

@Suppress("ObjectPropertyName")
private var _forward30: ImageVector? = null
