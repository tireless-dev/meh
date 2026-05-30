// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CouplingFacilityEncryption: ImageVector
  get() {
    val current = _couplingFacilityEncryption
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CouplingFacilityEncryption",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29 21.3 V20 c0 -2.2 -1.8 -4 -4 -4 s-4 1.8 -4 4 v1.3 c-.6 .3 -1 1 -1 1.7 v5 a2 2 0 0 0 2 2 h6 a2 2 0 0 0 2 -2 v-5 c0 -.7 -.4 -1.4 -1 -1.7 M25 18 a2 2 0 0 1 2 2 v1 h-4 v-1 a2 2 0 0 1 2 -2 m3 10 h-6 v-5 h6z m-10 2 H3 c-.3 0 -.7 -.2 -.9 -.5 s-.2 -.7 0 -1 l13 -25.9 c.3 -.7 1.4 -.7 1.8 0 l5.5 11 -1.8 .9 L16 5.2 4.6 28 H18z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29 21.3
          moveTo(x = 29.0f, y = 21.3f)
          // V 20
          verticalLineTo(y = 20.0f)
          // c 0 -2.2 -1.8 -4 -4 -4
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -2.2f,
            dx2 = -1.8f,
            dy2 = -4.0f,
            dx3 = -4.0f,
            dy3 = -4.0f,
          )
          // s -4 1.8 -4 4
          reflectiveCurveToRelative(
            dx1 = -4.0f,
            dy1 = 1.8f,
            dx2 = -4.0f,
            dy2 = 4.0f,
          )
          // v 1.3
          verticalLineToRelative(dy = 1.3f)
          // c -0.6 0.3 -1 1 -1 1.7
          curveToRelative(
            dx1 = -0.6f,
            dy1 = 0.3f,
            dx2 = -1.0f,
            dy2 = 1.0f,
            dx3 = -1.0f,
            dy3 = 1.7f,
          )
          // v 5
          verticalLineToRelative(dy = 5.0f)
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
          // h 6
          horizontalLineToRelative(dx = 6.0f)
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
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // c 0 -0.7 -0.4 -1.4 -1 -1.7
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.7f,
            dx2 = -0.4f,
            dy2 = -1.4f,
            dx3 = -1.0f,
            dy3 = -1.7f,
          )
          // M 25 18
          moveTo(x = 25.0f, y = 18.0f)
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
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -1
          verticalLineToRelative(dy = -1.0f)
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
          // m 3 10
          moveToRelative(dx = 3.0f, dy = 10.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
          close()
          // m -10 2
          moveToRelative(dx = -10.0f, dy = 2.0f)
          // H 3
          horizontalLineTo(x = 3.0f)
          // c -0.3 0 -0.7 -0.2 -0.9 -0.5
          curveToRelative(
            dx1 = -0.3f,
            dy1 = 0.0f,
            dx2 = -0.7f,
            dy2 = -0.2f,
            dx3 = -0.9f,
            dy3 = -0.5f,
          )
          // s -0.2 -0.7 0 -1
          reflectiveCurveToRelative(
            dx1 = -0.2f,
            dy1 = -0.7f,
            dx2 = 0.0f,
            dy2 = -1.0f,
          )
          // l 13 -25.9
          lineToRelative(dx = 13.0f, dy = -25.9f)
          // c 0.3 -0.7 1.4 -0.7 1.8 0
          curveToRelative(
            dx1 = 0.3f,
            dy1 = -0.7f,
            dx2 = 1.4f,
            dy2 = -0.7f,
            dx3 = 1.8f,
            dy3 = 0.0f,
          )
          // l 5.5 11
          lineToRelative(dx = 5.5f, dy = 11.0f)
          // l -1.8 0.9
          lineToRelative(dx = -1.8f, dy = 0.9f)
          // L 16 5.2
          lineTo(x = 16.0f, y = 5.2f)
          // L 4.6 28
          lineTo(x = 4.6f, y = 28.0f)
          // H 18z
          horizontalLineTo(x = 18.0f)
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
      .also { _couplingFacilityEncryption = it }
  }

@Suppress("ObjectPropertyName")
private var _couplingFacilityEncryption: ImageVector? = null
