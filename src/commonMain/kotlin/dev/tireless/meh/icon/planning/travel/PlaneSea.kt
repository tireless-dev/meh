// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PlaneSea: ImageVector
  get() {
    val current = _planeSea
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PlaneSea",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 30 h-2 a5 5 0 0 1 -4 -1.99 5.02 5.02 0 0 1 -8 0 5.02 5.02 0 0 1 -8 0 A5 5 0 0 1 4 30 H2 v-2 h2 a3.4 3.4 0 0 0 3.05 -2.32 A1 1 0 0 1 8 25 a1 1 0 0 1 .95 .68 A3.4 3.4 0 0 0 12 28 a3.4 3.4 0 0 0 3.05 -2.32 A1 1 0 0 1 16 25 a1 1 0 0 1 .95 .68 A3.4 3.4 0 0 0 20 28 a3.4 3.4 0 0 0 3.05 -2.32 1 1 0 0 1 1.9 0 A3.4 3.4 0 0 0 28 28 h2Z M28 6 v4 h-2.5 l-2.1 -2.8 A3 3 0 0 0 21 6 h-6 a3 3 0 0 0 -3 3 v1 H8.62 L7.89 8.55 l-1 -2 A1 1 0 0 0 6 6 H3 a1 1 0 0 0 -1 1 v6 a3 3 0 0 0 3 3 h6.82 l-.67 4 H7 a1 1 0 0 0 0 2 h20 a1 1 0 0 0 0 -2 h-4.15 l-.67 -4 h.16 a5 5 0 0 0 3.54 -1.46 L28 12.4 V16 h2 V6Z M14 9 a1 1 0 0 1 1 -1 h6 a1 1 0 0 1 .8 .4 L23 10 h-9Z m6.82 11 h-7.64 l.67 -4 h6.3Z m1.52 -6 H5 a1 1 0 0 1 -1 -1 V8 h1.38 l.73 1.45 L7.38 12 h18.2 l-1.12 1.12 A3 3 0 0 1 22.34 14
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 30
          moveTo(x = 30.0f, y = 30.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // a 5 5 0 0 1 -4 -1.99
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = -1.99f,
          )
          // a 5.02 5.02 0 0 1 -8 0
          arcToRelative(
            a = 5.02f,
            b = 5.02f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -8.0f,
            dy1 = 0.0f,
          )
          // a 5.02 5.02 0 0 1 -8 0
          arcToRelative(
            a = 5.02f,
            b = 5.02f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -8.0f,
            dy1 = 0.0f,
          )
          // A 5 5 0 0 1 4 30
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.0f,
            y1 = 30.0f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 3.4 3.4 0 0 0 3.05 -2.32
          arcToRelative(
            a = 3.4f,
            b = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.05f,
            dy1 = -2.32f,
          )
          // A 1 1 0 0 1 8 25
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 8.0f,
            y1 = 25.0f,
          )
          // a 1 1 0 0 1 0.95 0.68
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.95f,
            dy1 = 0.68f,
          )
          // A 3.4 3.4 0 0 0 12 28
          arcTo(
            horizontalEllipseRadius = 3.4f,
            verticalEllipseRadius = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 12.0f,
            y1 = 28.0f,
          )
          // a 3.4 3.4 0 0 0 3.05 -2.32
          arcToRelative(
            a = 3.4f,
            b = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.05f,
            dy1 = -2.32f,
          )
          // A 1 1 0 0 1 16 25
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 25.0f,
          )
          // a 1 1 0 0 1 0.95 0.68
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.95f,
            dy1 = 0.68f,
          )
          // A 3.4 3.4 0 0 0 20 28
          arcTo(
            horizontalEllipseRadius = 3.4f,
            verticalEllipseRadius = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 20.0f,
            y1 = 28.0f,
          )
          // a 3.4 3.4 0 0 0 3.05 -2.32
          arcToRelative(
            a = 3.4f,
            b = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.05f,
            dy1 = -2.32f,
          )
          // a 1 1 0 0 1 1.9 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.9f,
            dy1 = 0.0f,
          )
          // A 3.4 3.4 0 0 0 28 28
          arcTo(
            horizontalEllipseRadius = 3.4f,
            verticalEllipseRadius = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 28.0f,
            y1 = 28.0f,
          )
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // M 28 6
          moveTo(x = 28.0f, y = 6.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2.5
          horizontalLineToRelative(dx = -2.5f)
          // l -2.1 -2.8
          lineToRelative(dx = -2.1f, dy = -2.8f)
          // A 3 3 0 0 0 21 6
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 21.0f,
            y1 = 6.0f,
          )
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // a 3 3 0 0 0 -3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = 3.0f,
          )
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // H 8.62
          horizontalLineTo(x = 8.62f)
          // L 7.89 8.55
          lineTo(x = 7.89f, y = 8.55f)
          // l -1 -2
          lineToRelative(dx = -1.0f, dy = -2.0f)
          // A 1 1 0 0 0 6 6
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.0f,
            y1 = 6.0f,
          )
          // H 3
          horizontalLineTo(x = 3.0f)
          // a 1 1 0 0 0 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // a 3 3 0 0 0 3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.0f,
            dy1 = 3.0f,
          )
          // h 6.82
          horizontalLineToRelative(dx = 6.82f)
          // l -0.67 4
          lineToRelative(dx = -0.67f, dy = 4.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
          // a 1 1 0 0 0 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // a 1 1 0 0 0 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // h -4.15
          horizontalLineToRelative(dx = -4.15f)
          // l -0.67 -4
          lineToRelative(dx = -0.67f, dy = -4.0f)
          // h 0.16
          horizontalLineToRelative(dx = 0.16f)
          // a 5 5 0 0 0 3.54 -1.46
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.54f,
            dy1 = -1.46f,
          )
          // L 28 12.4
          lineTo(x = 28.0f, y = 12.4f)
          // V 16
          verticalLineTo(y = 16.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 6z
          verticalLineTo(y = 6.0f)
          close()
          // M 14 9
          moveTo(x = 14.0f, y = 9.0f)
          // a 1 1 0 0 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 1 1 0 0 1 0.8 0.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.8f,
            dy1 = 0.4f,
          )
          // L 23 10
          lineTo(x = 23.0f, y = 10.0f)
          // h -9z
          horizontalLineToRelative(dx = -9.0f)
          close()
          // m 6.82 11
          moveToRelative(dx = 6.82f, dy = 11.0f)
          // h -7.64
          horizontalLineToRelative(dx = -7.64f)
          // l 0.67 -4
          lineToRelative(dx = 0.67f, dy = -4.0f)
          // h 6.3z
          horizontalLineToRelative(dx = 6.3f)
          close()
          // m 1.52 -6
          moveToRelative(dx = 1.52f, dy = -6.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // a 1 1 0 0 1 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // V 8
          verticalLineTo(y = 8.0f)
          // h 1.38
          horizontalLineToRelative(dx = 1.38f)
          // l 0.73 1.45
          lineToRelative(dx = 0.73f, dy = 1.45f)
          // L 7.38 12
          lineTo(x = 7.38f, y = 12.0f)
          // h 18.2
          horizontalLineToRelative(dx = 18.2f)
          // l -1.12 1.12
          lineToRelative(dx = -1.12f, dy = 1.12f)
          // A 3 3 0 0 1 22.34 14
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 22.34f,
            y1 = 14.0f,
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
      .also { _planeSea = it }
  }

@Suppress("ObjectPropertyName")
private var _planeSea: ImageVector? = null
