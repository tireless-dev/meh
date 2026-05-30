// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val KubernetesIpAddress: ImageVector
  get() {
    val current = _kubernetesIpAddress
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.KubernetesIpAddress",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="16.0" cy="9.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 9
          moveTo(x = 16.0f, y = 9.0f)
          // m -2 0
          moveToRelative(dx = -2.0f, dy = 0.0f)
          // a 2 2 0 1 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // a 2 2 0 1 1 -4 0z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // <circle cx="16.0" cy="16.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 16
          moveTo(x = 16.0f, y = 16.0f)
          // m -2 0
          moveToRelative(dx = -2.0f, dy = 0.0f)
          // a 2 2 0 1 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // a 2 2 0 1 1 -4 0z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M18.82 26 A3 3 0 0 0 17 24.18 V22 h3 a1 1 0 0 0 .77 -.36 l5 -6 a1 1 0 0 0 .2 -.86 l-2 -9 a1 1 0 0 0 -.58 -.7 l-7 -3 a1 1 0 0 0 -.78 0 l-7 3 a1 1 0 0 0 -.59 .7 l-2 9 a1 1 0 0 0 .21 .86 l5 6 A1 1 0 0 0 12 22 h3 v2.18 A3 3 0 0 0 13.18 26 H4 v2 h9.18 A3 3 0 0 0 16 30 a3 3 0 0 0 2.82 -2 H28 v-2z M8.08 14.74 l1.78 -8.02 L16 4.09 l6.14 2.63 1.78 8.02 L19.53 20 h-7.06z M16 28 a1 1 0 1 1 0 -2 1 1 0 0 1 0 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18.82 26
          moveTo(x = 18.82f, y = 26.0f)
          // A 3 3 0 0 0 17 24.18
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 17.0f,
            y1 = 24.18f,
          )
          // V 22
          verticalLineTo(y = 22.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // a 1 1 0 0 0 0.77 -0.36
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.77f,
            dy1 = -0.36f,
          )
          // l 5 -6
          lineToRelative(dx = 5.0f, dy = -6.0f)
          // a 1 1 0 0 0 0.2 -0.86
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.2f,
            dy1 = -0.86f,
          )
          // l -2 -9
          lineToRelative(dx = -2.0f, dy = -9.0f)
          // a 1 1 0 0 0 -0.58 -0.7
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.58f,
            dy1 = -0.7f,
          )
          // l -7 -3
          lineToRelative(dx = -7.0f, dy = -3.0f)
          // a 1 1 0 0 0 -0.78 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.78f,
            dy1 = 0.0f,
          )
          // l -7 3
          lineToRelative(dx = -7.0f, dy = 3.0f)
          // a 1 1 0 0 0 -0.59 0.7
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.59f,
            dy1 = 0.7f,
          )
          // l -2 9
          lineToRelative(dx = -2.0f, dy = 9.0f)
          // a 1 1 0 0 0 0.21 0.86
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.21f,
            dy1 = 0.86f,
          )
          // l 5 6
          lineToRelative(dx = 5.0f, dy = 6.0f)
          // A 1 1 0 0 0 12 22
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 12.0f,
            y1 = 22.0f,
          )
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 2.18
          verticalLineToRelative(dy = 2.18f)
          // A 3 3 0 0 0 13.18 26
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 13.18f,
            y1 = 26.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 9.18
          horizontalLineToRelative(dx = 9.18f)
          // A 3 3 0 0 0 16 30
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 30.0f,
          )
          // a 3 3 0 0 0 2.82 -2
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.82f,
            dy1 = -2.0f,
          )
          // H 28
          horizontalLineTo(x = 28.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
          // M 8.08 14.74
          moveTo(x = 8.08f, y = 14.74f)
          // l 1.78 -8.02
          lineToRelative(dx = 1.78f, dy = -8.02f)
          // L 16 4.09
          lineTo(x = 16.0f, y = 4.09f)
          // l 6.14 2.63
          lineToRelative(dx = 6.14f, dy = 2.63f)
          // l 1.78 8.02
          lineToRelative(dx = 1.78f, dy = 8.02f)
          // L 19.53 20
          lineTo(x = 19.53f, y = 20.0f)
          // h -7.06z
          horizontalLineToRelative(dx = -7.06f)
          close()
          // M 16 28
          moveTo(x = 16.0f, y = 28.0f)
          // a 1 1 0 1 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // a 1 1 0 0 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.0f,
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
      .also { _kubernetesIpAddress = it }
  }

@Suppress("ObjectPropertyName")
private var _kubernetesIpAddress: ImageVector? = null
