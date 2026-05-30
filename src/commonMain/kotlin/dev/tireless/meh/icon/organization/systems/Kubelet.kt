// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Kubelet: ImageVector
  get() {
    val current = _kubelet
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Kubelet",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m20.04 27.3 -3.08 -10.02 -1.01 3.04 A1 1 0 0 1 15 21 H9 v-2 h5.28 l1.77 -5.32 A1 1 0 0 1 17 13 a1 1 0 0 1 .96 .7 l3 9.78 1.08 -3.75 A1 1 0 0 1 23 19 h5 v2 h-4.25 l-1.79 6.27 A1 1 0 0 1 21.01 28 H21 a1 1 0 0 1 -.96 -.7
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20.04 27.3
          moveTo(x = 20.04f, y = 27.3f)
          // l -3.08 -10.02
          lineToRelative(dx = -3.08f, dy = -10.02f)
          // l -1.01 3.04
          lineToRelative(dx = -1.01f, dy = 3.04f)
          // A 1 1 0 0 1 15 21
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 15.0f,
            y1 = 21.0f,
          )
          // H 9
          horizontalLineTo(x = 9.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 5.28
          horizontalLineToRelative(dx = 5.28f)
          // l 1.77 -5.32
          lineToRelative(dx = 1.77f, dy = -5.32f)
          // A 1 1 0 0 1 17 13
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 17.0f,
            y1 = 13.0f,
          )
          // a 1 1 0 0 1 0.96 0.7
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.96f,
            dy1 = 0.7f,
          )
          // l 3 9.78
          lineToRelative(dx = 3.0f, dy = 9.78f)
          // l 1.08 -3.75
          lineToRelative(dx = 1.08f, dy = -3.75f)
          // A 1 1 0 0 1 23 19
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 23.0f,
            y1 = 19.0f,
          )
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4.25
          horizontalLineToRelative(dx = -4.25f)
          // l -1.79 6.27
          lineToRelative(dx = -1.79f, dy = 6.27f)
          // A 1 1 0 0 1 21.01 28
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 21.01f,
            y1 = 28.0f,
          )
          // H 21
          horizontalLineTo(x = 21.0f)
          // a 1 1 0 0 1 -0.96 -0.7
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.96f,
            dy1 = -0.7f,
          )
        }
        // M16 28 H6 a2 2 0 0 1 -2 -2 V6 a2 2 0 0 1 2 -2 h20 a2 2 0 0 1 2 2 v9 h-2 V6 H6 v20 h10z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 28
          moveTo(x = 16.0f, y = 28.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // V 6
          verticalLineTo(y = 6.0f)
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
          // v 9
          verticalLineToRelative(dy = 9.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // h 10z
          horizontalLineToRelative(dx = 10.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
        path(
          fill = SolidColor(Color.Transparent),
          strokeLineWidth = 0.0f,
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
      .also { _kubelet = it }
  }

@Suppress("ObjectPropertyName")
private var _kubelet: ImageVector? = null
