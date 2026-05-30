// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.alphanumeric

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Beta: ImageVector
  get() {
    val current = _beta
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Beta",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M20.72 13.77 A6 6 0 0 0 23 9 c0 -3.53 -2.88 -6 -7 -6 a6.63 6.63 0 0 0 -7 7 v21 h2 v-5.88 a8.1 8.1 0 0 0 6 2.48 7.4 7.4 0 0 0 7.65 -7.6 6.6 6.6 0 0 0 -3.93 -6.23 M17 25.6 a5.7 5.7 0 0 1 -6 -5.6 V10 a4.7 4.7 0 0 1 5 -5 c3.04 0 5 1.57 5 4 a3.87 3.87 0 0 1 -4 4 v2 c3.43 0 5.65 1.96 5.65 5 A5.4 5.4 0 0 1 17 25.6
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20.72 13.77
          moveTo(x = 20.72f, y = 13.77f)
          // A 6 6 0 0 0 23 9
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 23.0f,
            y1 = 9.0f,
          )
          // c 0 -3.53 -2.88 -6 -7 -6
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -3.53f,
            dx2 = -2.88f,
            dy2 = -6.0f,
            dx3 = -7.0f,
            dy3 = -6.0f,
          )
          // a 6.63 6.63 0 0 0 -7 7
          arcToRelative(
            a = 6.63f,
            b = 6.63f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.0f,
            dy1 = 7.0f,
          )
          // v 21
          verticalLineToRelative(dy = 21.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -5.88
          verticalLineToRelative(dy = -5.88f)
          // a 8.1 8.1 0 0 0 6 2.48
          arcToRelative(
            a = 8.1f,
            b = 8.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 6.0f,
            dy1 = 2.48f,
          )
          // a 7.4 7.4 0 0 0 7.65 -7.6
          arcToRelative(
            a = 7.4f,
            b = 7.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 7.65f,
            dy1 = -7.6f,
          )
          // a 6.6 6.6 0 0 0 -3.93 -6.23
          arcToRelative(
            a = 6.6f,
            b = 6.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.93f,
            dy1 = -6.23f,
          )
          // M 17 25.6
          moveTo(x = 17.0f, y = 25.6f)
          // a 5.7 5.7 0 0 1 -6 -5.6
          arcToRelative(
            a = 5.7f,
            b = 5.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -6.0f,
            dy1 = -5.6f,
          )
          // V 10
          verticalLineTo(y = 10.0f)
          // a 4.7 4.7 0 0 1 5 -5
          arcToRelative(
            a = 4.7f,
            b = 4.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = -5.0f,
          )
          // c 3.04 0 5 1.57 5 4
          curveToRelative(
            dx1 = 3.04f,
            dy1 = 0.0f,
            dx2 = 5.0f,
            dy2 = 1.57f,
            dx3 = 5.0f,
            dy3 = 4.0f,
          )
          // a 3.87 3.87 0 0 1 -4 4
          arcToRelative(
            a = 3.87f,
            b = 3.87f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // c 3.43 0 5.65 1.96 5.65 5
          curveToRelative(
            dx1 = 3.43f,
            dy1 = 0.0f,
            dx2 = 5.65f,
            dy2 = 1.96f,
            dx3 = 5.65f,
            dy3 = 5.0f,
          )
          // A 5.4 5.4 0 0 1 17 25.6
          arcTo(
            horizontalEllipseRadius = 5.4f,
            verticalEllipseRadius = 5.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 17.0f,
            y1 = 25.6f,
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
      .also { _beta = it }
  }

@Suppress("ObjectPropertyName")
private var _beta: ImageVector? = null
