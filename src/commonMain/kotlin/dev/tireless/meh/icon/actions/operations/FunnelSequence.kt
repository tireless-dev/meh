// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FunnelSequence: ImageVector
  get() {
    val current = _funnelSequence
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FunnelSequence",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29 8 H9 a2 2 0 0 0 -2 2 v3.6 c0 .5 .2 1 .6 1.4 l7.4 7.4 V28 a2 2 0 0 0 2 2 h4 a2 2 0 0 0 2 -2 v-5.6 l7.4 -7.4 c.4 -.4 .6 -.9 .6 -1.4 V10 a2 2 0 0 0 -2 -2 m0 5.6 -8 8 V28 h-4 v-6.4 l-8 -8 V10 h20z m-25 -6 1 1 v2.8 L2.6 9 A2 2 0 0 1 2 7.6 V4 a2 2 0 0 1 2 -2 h20 a2 2 0 0 1 2 2 v2 h-2 V4 H4z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29 8
          moveTo(x = 29.0f, y = 8.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 3.6
          verticalLineToRelative(dy = 3.6f)
          // c 0 0.5 0.2 1 0.6 1.4
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.5f,
            dx2 = 0.2f,
            dy2 = 1.0f,
            dx3 = 0.6f,
            dy3 = 1.4f,
          )
          // l 7.4 7.4
          lineToRelative(dx = 7.4f, dy = 7.4f)
          // V 28
          verticalLineTo(y = 28.0f)
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
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // v -5.6
          verticalLineToRelative(dy = -5.6f)
          // l 7.4 -7.4
          lineToRelative(dx = 7.4f, dy = -7.4f)
          // c 0.4 -0.4 0.6 -0.9 0.6 -1.4
          curveToRelative(
            dx1 = 0.4f,
            dy1 = -0.4f,
            dx2 = 0.6f,
            dy2 = -0.9f,
            dx3 = 0.6f,
            dy3 = -1.4f,
          )
          // V 10
          verticalLineTo(y = 10.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // m 0 5.6
          moveToRelative(dx = 0.0f, dy = 5.6f)
          // l -8 8
          lineToRelative(dx = -8.0f, dy = 8.0f)
          // V 28
          verticalLineTo(y = 28.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -6.4
          verticalLineToRelative(dy = -6.4f)
          // l -8 -8
          lineToRelative(dx = -8.0f, dy = -8.0f)
          // V 10
          verticalLineTo(y = 10.0f)
          // h 20z
          horizontalLineToRelative(dx = 20.0f)
          close()
          // m -25 -6
          moveToRelative(dx = -25.0f, dy = -6.0f)
          // l 1 1
          lineToRelative(dx = 1.0f, dy = 1.0f)
          // v 2.8
          verticalLineToRelative(dy = 2.8f)
          // L 2.6 9
          lineTo(x = 2.6f, y = 9.0f)
          // A 2 2 0 0 1 2 7.6
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 2.0f,
            y1 = 7.6f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
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
          // h 20
          horizontalLineToRelative(dx = 20.0f)
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
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // H 4z
          horizontalLineTo(x = 4.0f)
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
      .also { _funnelSequence = it }
  }

@Suppress("ObjectPropertyName")
private var _funnelSequence: ImageVector? = null
