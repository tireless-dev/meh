// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TwoPersonLift: ImageVector
  get() {
    val current = _twoPersonLift
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TwoPersonLift",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m26.96 30 -1.92 -6.73 a1 1 0 0 1 .34 -1.05 l4.5 -3.6 -1.36 -5.42 -2.74 3.42 A1 1 0 0 1 25 17 h-5 v-2 h4.52 l3.7 -4.62 a1 1 0 0 1 1.75 .38 l2 8 a1 1 0 0 1 -.34 1.02 l-4.48 3.59 1.73 6.08Z M23 5.5 A3.5 3.5 0 1 1 26.5 9 3.5 3.5 0 0 1 23 5.5 m2 0 A1.5 1.5 0 1 0 26.5 4 1.5 1.5 0 0 0 25 5.5
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26.96 30
          moveTo(x = 26.96f, y = 30.0f)
          // l -1.92 -6.73
          lineToRelative(dx = -1.92f, dy = -6.73f)
          // a 1 1 0 0 1 0.34 -1.05
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.34f,
            dy1 = -1.05f,
          )
          // l 4.5 -3.6
          lineToRelative(dx = 4.5f, dy = -3.6f)
          // l -1.36 -5.42
          lineToRelative(dx = -1.36f, dy = -5.42f)
          // l -2.74 3.42
          lineToRelative(dx = -2.74f, dy = 3.42f)
          // A 1 1 0 0 1 25 17
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 25.0f,
            y1 = 17.0f,
          )
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 4.52
          horizontalLineToRelative(dx = 4.52f)
          // l 3.7 -4.62
          lineToRelative(dx = 3.7f, dy = -4.62f)
          // a 1 1 0 0 1 1.75 0.38
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.75f,
            dy1 = 0.38f,
          )
          // l 2 8
          lineToRelative(dx = 2.0f, dy = 8.0f)
          // a 1 1 0 0 1 -0.34 1.02
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.34f,
            dy1 = 1.02f,
          )
          // l -4.48 3.59
          lineToRelative(dx = -4.48f, dy = 3.59f)
          // l 1.73 6.08z
          lineToRelative(dx = 1.73f, dy = 6.08f)
          close()
          // M 23 5.5
          moveTo(x = 23.0f, y = 5.5f)
          // A 3.5 3.5 0 1 1 26.5 9
          arcTo(
            horizontalEllipseRadius = 3.5f,
            verticalEllipseRadius = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 26.5f,
            y1 = 9.0f,
          )
          // A 3.5 3.5 0 0 1 23 5.5
          arcTo(
            horizontalEllipseRadius = 3.5f,
            verticalEllipseRadius = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 23.0f,
            y1 = 5.5f,
          )
          // m 2 0
          moveToRelative(dx = 2.0f, dy = 0.0f)
          // A 1.5 1.5 0 1 0 26.5 4
          arcTo(
            horizontalEllipseRadius = 1.5f,
            verticalEllipseRadius = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 26.5f,
            y1 = 4.0f,
          )
          // A 1.5 1.5 0 0 0 25 5.5
          arcTo(
            horizontalEllipseRadius = 1.5f,
            verticalEllipseRadius = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 25.0f,
            y1 = 5.5f,
          )
        }
        // M20 19 a2 2 0 0 1 -2 -2 v-2 a2 2 0 0 1 2 -2 h2 v-3 H10 v3 h2 a2 2 0 0 1 2 2 v2 a2 2 0 0 1 -2 2 h-2 v3 h12 v-3Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 19
          moveTo(x = 20.0f, y = 19.0f)
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
          // v -2
          verticalLineToRelative(dy = -2.0f)
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
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
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
          // v 2
          verticalLineToRelative(dy = 2.0f)
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
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v -3z
          verticalLineToRelative(dy = -3.0f)
          close()
        }
        // m5.04 30 1.92 -6.73 a1 1 0 0 0 -.34 -1.05 l-4.5 -3.6 1.36 -5.42 2.74 3.42 A1 1 0 0 0 7 17 h5 v-2 H7.48 l-3.7 -4.62 a1 1 0 0 0 -1.75 .38 l-2 8 a1 1 0 0 0 .35 1.02 l4.48 3.59 -1.74 6.08Z M5.5 9 A3.5 3.5 0 1 1 9 5.5 3.5 3.5 0 0 1 5.5 9 m0 -5 A1.5 1.5 0 1 0 7 5.5 1.5 1.5 0 0 0 5.5 4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 5.04 30
          moveTo(x = 5.04f, y = 30.0f)
          // l 1.92 -6.73
          lineToRelative(dx = 1.92f, dy = -6.73f)
          // a 1 1 0 0 0 -0.34 -1.05
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.34f,
            dy1 = -1.05f,
          )
          // l -4.5 -3.6
          lineToRelative(dx = -4.5f, dy = -3.6f)
          // l 1.36 -5.42
          lineToRelative(dx = 1.36f, dy = -5.42f)
          // l 2.74 3.42
          lineToRelative(dx = 2.74f, dy = 3.42f)
          // A 1 1 0 0 0 7 17
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.0f,
            y1 = 17.0f,
          )
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 7.48
          horizontalLineTo(x = 7.48f)
          // l -3.7 -4.62
          lineToRelative(dx = -3.7f, dy = -4.62f)
          // a 1 1 0 0 0 -1.75 0.38
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.75f,
            dy1 = 0.38f,
          )
          // l -2 8
          lineToRelative(dx = -2.0f, dy = 8.0f)
          // a 1 1 0 0 0 0.35 1.02
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.35f,
            dy1 = 1.02f,
          )
          // l 4.48 3.59
          lineToRelative(dx = 4.48f, dy = 3.59f)
          // l -1.74 6.08z
          lineToRelative(dx = -1.74f, dy = 6.08f)
          close()
          // M 5.5 9
          moveTo(x = 5.5f, y = 9.0f)
          // A 3.5 3.5 0 1 1 9 5.5
          arcTo(
            horizontalEllipseRadius = 3.5f,
            verticalEllipseRadius = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 9.0f,
            y1 = 5.5f,
          )
          // A 3.5 3.5 0 0 1 5.5 9
          arcTo(
            horizontalEllipseRadius = 3.5f,
            verticalEllipseRadius = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 5.5f,
            y1 = 9.0f,
          )
          // m 0 -5
          moveToRelative(dx = 0.0f, dy = -5.0f)
          // A 1.5 1.5 0 1 0 7 5.5
          arcTo(
            horizontalEllipseRadius = 1.5f,
            verticalEllipseRadius = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 7.0f,
            y1 = 5.5f,
          )
          // A 1.5 1.5 0 0 0 5.5 4
          arcTo(
            horizontalEllipseRadius = 1.5f,
            verticalEllipseRadius = 1.5f,
          theta = 0.0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          x1 = 5.5f,
          y1 = 4.0f,
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
      .also { _twoPersonLift = it }
  }

@Suppress("ObjectPropertyName")
private var _twoPersonLift: ImageVector? = null
