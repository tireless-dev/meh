// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NetworkTimeProtocol: ImageVector
  get() {
    val current = _networkTimeProtocol
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.NetworkTimeProtocol",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M18.8 27 c-.3 -.9 -1 -1.5 -1.8 -1.8 V22 c5 -.5 9 -4.8 9 -9.9 s-4.5 -10 -10 -10 S6 6.5 6 12 s3.9 9.5 9 10 v3.2 c-.9 .3 -1.5 1 -1.8 1.8 H4 v2 h9.2 c.4 1.2 1.5 2 2.8 2 s2.4 -.8 2.8 -2 H28 v-2z M8 12 c0 -4.4 3.6 -8 8 -8 s8 3.6 8 8 -3.6 8 -8 8 -8 -3.6 -8 -8 m8 17 a1 1 0 0 1 0 -2 c.6 0 1 .5 1 1 s-.5 1 -1 1 m3.3 -12.3 L15 12.4 V6 h2 v5.6 l3.7 3.7z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18.8 27
          moveTo(x = 18.8f, y = 27.0f)
          // c -0.3 -0.9 -1 -1.5 -1.8 -1.8
          curveToRelative(
            dx1 = -0.3f,
            dy1 = -0.9f,
            dx2 = -1.0f,
            dy2 = -1.5f,
            dx3 = -1.8f,
            dy3 = -1.8f,
          )
          // V 22
          verticalLineTo(y = 22.0f)
          // c 5 -0.5 9 -4.8 9 -9.9
          curveToRelative(
            dx1 = 5.0f,
            dy1 = -0.5f,
            dx2 = 9.0f,
            dy2 = -4.8f,
            dx3 = 9.0f,
            dy3 = -9.9f,
          )
          // s -4.5 -10 -10 -10
          reflectiveCurveToRelative(
            dx1 = -4.5f,
            dy1 = -10.0f,
            dx2 = -10.0f,
            dy2 = -10.0f,
          )
          // S 6 6.5 6 12
          reflectiveCurveTo(
            x1 = 6.0f,
            y1 = 6.5f,
            x2 = 6.0f,
            y2 = 12.0f,
          )
          // s 3.9 9.5 9 10
          reflectiveCurveToRelative(
            dx1 = 3.9f,
            dy1 = 9.5f,
            dx2 = 9.0f,
            dy2 = 10.0f,
          )
          // v 3.2
          verticalLineToRelative(dy = 3.2f)
          // c -0.9 0.3 -1.5 1 -1.8 1.8
          curveToRelative(
            dx1 = -0.9f,
            dy1 = 0.3f,
            dx2 = -1.5f,
            dy2 = 1.0f,
            dx3 = -1.8f,
            dy3 = 1.8f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 9.2
          horizontalLineToRelative(dx = 9.2f)
          // c 0.4 1.2 1.5 2 2.8 2
          curveToRelative(
            dx1 = 0.4f,
            dy1 = 1.2f,
            dx2 = 1.5f,
            dy2 = 2.0f,
            dx3 = 2.8f,
            dy3 = 2.0f,
          )
          // s 2.4 -0.8 2.8 -2
          reflectiveCurveToRelative(
            dx1 = 2.4f,
            dy1 = -0.8f,
            dx2 = 2.8f,
            dy2 = -2.0f,
          )
          // H 28
          horizontalLineTo(x = 28.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
          // M 8 12
          moveTo(x = 8.0f, y = 12.0f)
          // c 0 -4.4 3.6 -8 8 -8
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -4.4f,
            dx2 = 3.6f,
            dy2 = -8.0f,
            dx3 = 8.0f,
            dy3 = -8.0f,
          )
          // s 8 3.6 8 8
          reflectiveCurveToRelative(
            dx1 = 8.0f,
            dy1 = 3.6f,
            dx2 = 8.0f,
            dy2 = 8.0f,
          )
          // s -3.6 8 -8 8
          reflectiveCurveToRelative(
            dx1 = -3.6f,
            dy1 = 8.0f,
            dx2 = -8.0f,
            dy2 = 8.0f,
          )
          // s -8 -3.6 -8 -8
          reflectiveCurveToRelative(
            dx1 = -8.0f,
            dy1 = -3.6f,
            dx2 = -8.0f,
            dy2 = -8.0f,
          )
          // m 8 17
          moveToRelative(dx = 8.0f, dy = 17.0f)
          // a 1 1 0 0 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // c 0.6 0 1 0.5 1 1
          curveToRelative(
            dx1 = 0.6f,
            dy1 = 0.0f,
            dx2 = 1.0f,
            dy2 = 0.5f,
            dx3 = 1.0f,
            dy3 = 1.0f,
          )
          // s -0.5 1 -1 1
          reflectiveCurveToRelative(
            dx1 = -0.5f,
            dy1 = 1.0f,
            dx2 = -1.0f,
            dy2 = 1.0f,
          )
          // m 3.3 -12.3
          moveToRelative(dx = 3.3f, dy = -12.3f)
          // L 15 12.4
          lineTo(x = 15.0f, y = 12.4f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 5.6
          verticalLineToRelative(dy = 5.6f)
          // l 3.7 3.7z
          lineToRelative(dx = 3.7f, dy = 3.7f)
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
      .also { _networkTimeProtocol = it }
  }

@Suppress("ObjectPropertyName")
private var _networkTimeProtocol: ImageVector? = null
