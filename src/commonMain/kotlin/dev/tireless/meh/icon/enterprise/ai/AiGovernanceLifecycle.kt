// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.ai

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AiGovernanceLifecycle: ImageVector
  get() {
    val current = _aiGovernanceLifecycle
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.AiGovernanceLifecycle",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m16 23 -2.14 -1.01 A5 5 0 0 1 11 17.47 V11 h10 v6.47 c0 1.92 -1.12 3.7 -2.86 4.52z m-3 -10 v4.47 a3 3 0 0 0 1.72 2.7 L16 20.8 l1.28 -.61 A3 3 0 0 0 19 17.47 V13z m-8.88 4.66 a2 2 0 1 0 -2 .13 14 14 0 0 0 9.57 11.53 l.62 -1.9 a12 12 0 0 1 -8.19 -9.76 m25.2 2.65 -1.9 -.62 a12 12 0 0 1 -9.76 8.19 2 2 0 1 0 .13 2 14 14 0 0 0 11.53 -9.57 m.56 -6.1 A14 14 0 0 0 20.3 2.68 l-.62 1.9 a12 12 0 0 1 8.19 9.76 2 2 0 1 0 2 -.13 M16 1 a2 2 0 0 0 -1.79 1.12 A14 14 0 0 0 2.68 11.7 l1.9 .62 a12 12 0 0 1 9.76 -8.19 A2 2 0 1 0 16 1
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
          // m 25.2 2.65
          moveToRelative(dx = 25.2f, dy = 2.65f)
          // l -1.9 -0.62
          lineToRelative(dx = -1.9f, dy = -0.62f)
          // a 12 12 0 0 1 -9.76 8.19
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -9.76f,
            dy1 = 8.19f,
          )
          // a 2 2 0 1 0 0.13 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.13f,
            dy1 = 2.0f,
          )
          // a 14 14 0 0 0 11.53 -9.57
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 11.53f,
            dy1 = -9.57f,
          )
          // m 0.56 -6.1
          moveToRelative(dx = 0.56f, dy = -6.1f)
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
      .also { _aiGovernanceLifecycle = it }
  }

@Suppress("ObjectPropertyName")
private var _aiGovernanceLifecycle: ImageVector? = null
