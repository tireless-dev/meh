// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.ai

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AiGovernanceUntracked: ImageVector
  get() {
    val current = _aiGovernanceUntracked
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.AiGovernanceUntracked",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="27.4102 26.0 31.0 22.4102 29.5901 21.0 26.0 24.5898 22.4102 21.0 21.0 22.4102 24.5901 26.0 21.0 29.5898 22.4102 31.0 26.0 27.4102 29.5901 31.0 31.0 29.5898 27.4102 26.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27.4102 26
          moveTo(x = 27.4102f, y = 26.0f)
          // L 31 22.4102
          lineTo(x = 31.0f, y = 22.4102f)
          // L 29.5901 21
          lineTo(x = 29.5901f, y = 21.0f)
          // L 26 24.5898
          lineTo(x = 26.0f, y = 24.5898f)
          // L 22.4102 21
          lineTo(x = 22.4102f, y = 21.0f)
          // L 21 22.4102
          lineTo(x = 21.0f, y = 22.4102f)
          // L 24.5901 26
          lineTo(x = 24.5901f, y = 26.0f)
          // L 21 29.5898
          lineTo(x = 21.0f, y = 29.5898f)
          // L 22.4102 31
          lineTo(x = 22.4102f, y = 31.0f)
          // L 26 27.4102
          lineTo(x = 26.0f, y = 27.4102f)
          // L 29.5901 31
          lineTo(x = 29.5901f, y = 31.0f)
          // L 31 29.5898
          lineTo(x = 31.0f, y = 29.5898f)
          // L 27.4102 26z
          lineTo(x = 27.4102f, y = 26.0f)
          close()
        }
        // m16 23 -2.14 -1.01 A5 5 0 0 1 11 17.47 V11 h10 v6.47 c0 1.92 -1.12 3.7 -2.86 4.52z m-3 -10 v4.47 a3 3 0 0 0 1.72 2.7 L16 20.8 l1.28 -.61 A3 3 0 0 0 19 17.47 V13z m-8.88 4.66 a2 2 0 1 0 -2 .13 14 14 0 0 0 9.57 11.53 l.62 -1.9 a12 12 0 0 1 -8.19 -9.76 m25.76 -3.45 A14 14 0 0 0 20.3 2.68 l-.62 1.9 a12 12 0 0 1 8.19 9.76 2 2 0 1 0 2 -.13 M16 1 a2 2 0 0 0 -1.79 1.12 A14 14 0 0 0 2.68 11.7 l1.9 .62 a12 12 0 0 1 9.76 -8.19 A2 2 0 1 0 16 1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 23
          moveTo(x = 16.0f, y = 23.0f)
          // l -2.14 -1.01
          lineToRelative(dx = -2.14f, dy = -1.01f)
          // A 5 5 0 0 1 11 17.47
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 11.0f,
            y1 = 17.47f,
          )
          // V 11
          verticalLineTo(y = 11.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 6.47
          verticalLineToRelative(dy = 6.47f)
          // c 0 1.92 -1.12 3.7 -2.86 4.52z
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 1.92f,
            dx2 = -1.12f,
            dy2 = 3.7f,
            dx3 = -2.86f,
            dy3 = 4.52f,
          )
          close()
          // m -3 -10
          moveToRelative(dx = -3.0f, dy = -10.0f)
          // v 4.47
          verticalLineToRelative(dy = 4.47f)
          // a 3 3 0 0 0 1.72 2.7
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.72f,
            dy1 = 2.7f,
          )
          // L 16 20.8
          lineTo(x = 16.0f, y = 20.8f)
          // l 1.28 -0.61
          lineToRelative(dx = 1.28f, dy = -0.61f)
          // A 3 3 0 0 0 19 17.47
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 19.0f,
            y1 = 17.47f,
          )
          // V 13z
          verticalLineTo(y = 13.0f)
          close()
          // m -8.88 4.66
          moveToRelative(dx = -8.88f, dy = 4.66f)
          // a 2 2 0 1 0 -2 0.13
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 0.13f,
          )
          // a 14 14 0 0 0 9.57 11.53
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 9.57f,
            dy1 = 11.53f,
          )
          // l 0.62 -1.9
          lineToRelative(dx = 0.62f, dy = -1.9f)
          // a 12 12 0 0 1 -8.19 -9.76
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -8.19f,
            dy1 = -9.76f,
          )
          // m 25.76 -3.45
          moveToRelative(dx = 25.76f, dy = -3.45f)
          // A 14 14 0 0 0 20.3 2.68
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 20.3f,
            y1 = 2.68f,
          )
          // l -0.62 1.9
          lineToRelative(dx = -0.62f, dy = 1.9f)
          // a 12 12 0 0 1 8.19 9.76
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 8.19f,
            dy1 = 9.76f,
          )
          // a 2 2 0 1 0 2 -0.13
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -0.13f,
          )
          // M 16 1
          moveTo(x = 16.0f, y = 1.0f)
          // a 2 2 0 0 0 -1.79 1.12
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.79f,
            dy1 = 1.12f,
          )
          // A 14 14 0 0 0 2.68 11.7
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.68f,
            y1 = 11.7f,
          )
          // l 1.9 0.62
          lineToRelative(dx = 1.9f, dy = 0.62f)
          // a 12 12 0 0 1 9.76 -8.19
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 9.76f,
            dy1 = -8.19f,
          )
          // A 2 2 0 1 0 16 1
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 1.0f,
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
      .also { _aiGovernanceUntracked = it }
  }

@Suppress("ObjectPropertyName")
private var _aiGovernanceUntracked: ImageVector? = null
