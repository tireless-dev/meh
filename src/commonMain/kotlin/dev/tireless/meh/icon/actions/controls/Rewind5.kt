// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Rewind5: ImageVector
  get() {
    val current = _rewind5
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Rewind5",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M4 18 A12 12 0 1 0 16 6 h-4 V1 L6 7 l6 6 V8 h4 A10 10 0 1 1 6 18Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 18
          moveTo(x = 4.0f, y = 18.0f)
          // A 12 12 0 1 0 16 6
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 6.0f,
          )
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 1
          verticalLineTo(y = 1.0f)
          // L 6 7
          lineTo(x = 6.0f, y = 7.0f)
          // l 6 6
          lineToRelative(dx = 6.0f, dy = 6.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // A 10 10 0 1 1 6 18z
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 6.0f,
            y1 = 18.0f,
          )
          close()
        }
        // M18.58 15.58 h-3.45 L15 18.15 l.26 -.45 a2 2 0 0 1 .33 -.35 2 2 0 0 1 .44 -.23 2 2 0 0 1 .6 -.08 3 3 0 0 1 .92 .16 2 2 0 0 1 .74 .48 2 2 0 0 1 .5 .77 3 3 0 0 1 .18 1 3 3 0 0 1 -.19 1.07 2.4 2.4 0 0 1 -.55 .84 2.4 2.4 0 0 1 -.89 .55 3 3 0 0 1 -1.21 .2 A4 4 0 0 1 15.19 22 a3 3 0 0 1 -.74 -.32 3 3 0 0 1 -.55 -.45 4 4 0 0 1 -.41 -.55 l1.06 -.81 .27 .41 a2 2 0 0 0 .34 .34 2 2 0 0 0 .43 .22 2 2 0 0 0 .55 .08 1.3 1.3 0 0 0 1 -.36 1.4 1.4 0 0 0 .33 -1 V19.5 a1.18 1.18 0 0 0 -1.28 -1.27 1.4 1.4 0 0 0 -.77 .18 2 2 0 0 0 -.48 .39 l-1.19 -.17 .29 -4.31 h4.52Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18.58 15.58
          moveTo(x = 18.58f, y = 15.58f)
          // h -3.45
          horizontalLineToRelative(dx = -3.45f)
          // L 15 18.15
          lineTo(x = 15.0f, y = 18.15f)
          // l 0.26 -0.45
          lineToRelative(dx = 0.26f, dy = -0.45f)
          // a 2 2 0 0 1 0.33 -0.35
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.33f,
            dy1 = -0.35f,
          )
          // a 2 2 0 0 1 0.44 -0.23
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.44f,
            dy1 = -0.23f,
          )
          // a 2 2 0 0 1 0.6 -0.08
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.6f,
            dy1 = -0.08f,
          )
          // a 3 3 0 0 1 0.92 0.16
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.92f,
            dy1 = 0.16f,
          )
          // a 2 2 0 0 1 0.74 0.48
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.74f,
            dy1 = 0.48f,
          )
          // a 2 2 0 0 1 0.5 0.77
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.5f,
            dy1 = 0.77f,
          )
          // a 3 3 0 0 1 0.18 1
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.18f,
            dy1 = 1.0f,
          )
          // a 3 3 0 0 1 -0.19 1.07
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.19f,
            dy1 = 1.07f,
          )
          // a 2.4 2.4 0 0 1 -0.55 0.84
          arcToRelative(
            a = 2.4f,
            b = 2.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.55f,
            dy1 = 0.84f,
          )
          // a 2.4 2.4 0 0 1 -0.89 0.55
          arcToRelative(
            a = 2.4f,
            b = 2.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.89f,
            dy1 = 0.55f,
          )
          // a 3 3 0 0 1 -1.21 0.2
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.21f,
            dy1 = 0.2f,
          )
          // A 4 4 0 0 1 15.19 22
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 15.19f,
            y1 = 22.0f,
          )
          // a 3 3 0 0 1 -0.74 -0.32
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.74f,
            dy1 = -0.32f,
          )
          // a 3 3 0 0 1 -0.55 -0.45
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.55f,
            dy1 = -0.45f,
          )
          // a 4 4 0 0 1 -0.41 -0.55
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.41f,
            dy1 = -0.55f,
          )
          // l 1.06 -0.81
          lineToRelative(dx = 1.06f, dy = -0.81f)
          // l 0.27 0.41
          lineToRelative(dx = 0.27f, dy = 0.41f)
          // a 2 2 0 0 0 0.34 0.34
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.34f,
            dy1 = 0.34f,
          )
          // a 2 2 0 0 0 0.43 0.22
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.43f,
            dy1 = 0.22f,
          )
          // a 2 2 0 0 0 0.55 0.08
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.55f,
            dy1 = 0.08f,
          )
          // a 1.3 1.3 0 0 0 1 -0.36
          arcToRelative(
            a = 1.3f,
            b = 1.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -0.36f,
          )
          // a 1.4 1.4 0 0 0 0.33 -1
          arcToRelative(
            a = 1.4f,
            b = 1.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.33f,
            dy1 = -1.0f,
          )
          // V 19.5
          verticalLineTo(y = 19.5f)
          // a 1.18 1.18 0 0 0 -1.28 -1.27
          arcToRelative(
            a = 1.18f,
            b = 1.18f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.28f,
            dy1 = -1.27f,
          )
          // a 1.4 1.4 0 0 0 -0.77 0.18
          arcToRelative(
            a = 1.4f,
            b = 1.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.77f,
            dy1 = 0.18f,
          )
          // a 2 2 0 0 0 -0.48 0.39
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.48f,
            dy1 = 0.39f,
          )
          // l -1.19 -0.17
          lineToRelative(dx = -1.19f, dy = -0.17f)
          // l 0.29 -4.31
          lineToRelative(dx = 0.29f, dy = -4.31f)
          // h 4.52z
          horizontalLineToRelative(dx = 4.52f)
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
      .also { _rewind5 = it }
  }

@Suppress("ObjectPropertyName")
private var _rewind5: ImageVector? = null
