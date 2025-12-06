// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RemoteConnection: ImageVector
  get() {
    val current = _remoteConnection
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.RemoteConnection",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M21.5 12 c-5.2 0 -9.5 4.3 -9.5 9.5 V22 H4 V6 h24 v6 h2 V6 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 v16 a2 2 0 0 0 2 2 h8.3 a10 10 0 0 0 2.2 4 H7.9 v2 h9.3 c1.3 .6 2.7 1 4.2 1 5.2 0 9.5 -4.3 9.5 -9.5 S26.6 12 21.4 12Z m0 17 c-4.1 0 -7.5 -3.4 -7.5 -7.5 s3.4 -7.5 7.5 -7.5 7.5 3.4 7.5 7.5 -3.4 7.5 -7.5 7.5 m-2.8 -4.3 -1.4 -1.4 2.3 -2.3 -2.3 -2.3 1.4 -1.4 3.7 3.7z M26 25 h-4 v-2 h4z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21.5 12
          moveTo(x = 21.5f, y = 12.0f)
          // c -5.2 0 -9.5 4.3 -9.5 9.5
          curveToRelative(
            dx1 = -5.2f,
            dy1 = 0.0f,
            dx2 = -9.5f,
            dy2 = 4.3f,
            dx3 = -9.5f,
            dy3 = 9.5f,
          )
          // V 22
          verticalLineTo(y = 22.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 6
          verticalLineTo(y = 6.0f)
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
          // H 4
          horizontalLineTo(x = 4.0f)
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
          // v 16
          verticalLineToRelative(dy = 16.0f)
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
          // h 8.3
          horizontalLineToRelative(dx = 8.3f)
          // a 10 10 0 0 0 2.2 4
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.2f,
            dy1 = 4.0f,
          )
          // H 7.9
          horizontalLineTo(x = 7.9f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 9.3
          horizontalLineToRelative(dx = 9.3f)
          // c 1.3 0.6 2.7 1 4.2 1
          curveToRelative(
            dx1 = 1.3f,
            dy1 = 0.6f,
            dx2 = 2.7f,
            dy2 = 1.0f,
            dx3 = 4.2f,
            dy3 = 1.0f,
          )
          // c 5.2 0 9.5 -4.3 9.5 -9.5
          curveToRelative(
            dx1 = 5.2f,
            dy1 = 0.0f,
            dx2 = 9.5f,
            dy2 = -4.3f,
            dx3 = 9.5f,
            dy3 = -9.5f,
          )
          // S 26.6 12 21.4 12z
          reflectiveCurveTo(
            x1 = 26.6f,
            y1 = 12.0f,
            x2 = 21.4f,
            y2 = 12.0f,
          )
          close()
          // m 0 17
          moveToRelative(dx = 0.0f, dy = 17.0f)
          // c -4.1 0 -7.5 -3.4 -7.5 -7.5
          curveToRelative(
            dx1 = -4.1f,
            dy1 = 0.0f,
            dx2 = -7.5f,
            dy2 = -3.4f,
            dx3 = -7.5f,
            dy3 = -7.5f,
          )
          // s 3.4 -7.5 7.5 -7.5
          reflectiveCurveToRelative(
            dx1 = 3.4f,
            dy1 = -7.5f,
            dx2 = 7.5f,
            dy2 = -7.5f,
          )
          // s 7.5 3.4 7.5 7.5
          reflectiveCurveToRelative(
            dx1 = 7.5f,
            dy1 = 3.4f,
            dx2 = 7.5f,
            dy2 = 7.5f,
          )
          // s -3.4 7.5 -7.5 7.5
          reflectiveCurveToRelative(
            dx1 = -3.4f,
            dy1 = 7.5f,
            dx2 = -7.5f,
            dy2 = 7.5f,
          )
          // m -2.8 -4.3
          moveToRelative(dx = -2.8f, dy = -4.3f)
          // l -1.4 -1.4
          lineToRelative(dx = -1.4f, dy = -1.4f)
          // l 2.3 -2.3
          lineToRelative(dx = 2.3f, dy = -2.3f)
          // l -2.3 -2.3
          lineToRelative(dx = -2.3f, dy = -2.3f)
          // l 1.4 -1.4
          lineToRelative(dx = 1.4f, dy = -1.4f)
          // l 3.7 3.7z
          lineToRelative(dx = 3.7f, dy = 3.7f)
          close()
          // M 26 25
          moveTo(x = 26.0f, y = 25.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
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
      .also { _remoteConnection = it }
  }

@Suppress("ObjectPropertyName")
private var _remoteConnection: ImageVector? = null
