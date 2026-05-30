// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VpnPolicy: ImageVector
  get() {
    val current = _vpnPolicy
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.VpnPolicy",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 15 a6 6 0 1 0 -10 4.46 V29 l4 -1.88 L28 29 v-9.54 A6 6 0 0 0 30 15 m-4 10.85 -2 -.94 -2 .94 v-5.2 a6 6 0 0 0 4 0Z M24 19 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 15
          moveTo(x = 30.0f, y = 15.0f)
          // a 6 6 0 1 0 -10 4.46
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -10.0f,
            dy1 = 4.46f,
          )
          // V 29
          verticalLineTo(y = 29.0f)
          // l 4 -1.88
          lineToRelative(dx = 4.0f, dy = -1.88f)
          // L 28 29
          lineTo(x = 28.0f, y = 29.0f)
          // v -9.54
          verticalLineToRelative(dy = -9.54f)
          // A 6 6 0 0 0 30 15
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 30.0f,
            y1 = 15.0f,
          )
          // m -4 10.85
          moveToRelative(dx = -4.0f, dy = 10.85f)
          // l -2 -0.94
          lineToRelative(dx = -2.0f, dy = -0.94f)
          // l -2 0.94
          lineToRelative(dx = -2.0f, dy = 0.94f)
          // v -5.2
          verticalLineToRelative(dy = -5.2f)
          // a 6 6 0 0 0 4 0z
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          close()
          // M 24 19
          moveTo(x = 24.0f, y = 19.0f)
          // a 4 4 0 1 1 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // a 4 4 0 0 1 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
        }
        // M14 2 a6 6 0 0 0 -6 6 v6 H6 a2 2 0 0 0 -2 2 v12 a2 2 0 0 0 2 2 h11 v-2 H6 V16 h9 v-2 h-5 V8 a4 4 0 0 1 7.92 -.8 l1.96 -.4 A6 6 0 0 0 14 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 2
          moveTo(x = 14.0f, y = 2.0f)
          // a 6 6 0 0 0 -6 6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.0f,
            dy1 = 6.0f,
          )
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // v 12
          verticalLineToRelative(dy = 12.0f)
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
          // h 11
          horizontalLineToRelative(dx = 11.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 16
          verticalLineTo(y = 16.0f)
          // h 9
          horizontalLineToRelative(dx = 9.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // a 4 4 0 0 1 7.92 -0.8
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 7.92f,
            dy1 = -0.8f,
          )
          // l 1.96 -0.4
          lineToRelative(dx = 1.96f, dy = -0.4f)
          // A 6 6 0 0 0 14 2
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 14.0f,
            y1 = 2.0f,
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
      .also { _vpnPolicy = it }
  }

@Suppress("ObjectPropertyName")
private var _vpnPolicy: ImageVector? = null
