// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NetworkPublic: ImageVector
  get() {
    val current = _networkPublic
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.NetworkPublic",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M22.5 13 a8.5 8.5 0 1 0 -.01 16.99 A8.5 8.5 0 0 0 22.5 13 m6.5 8 h-3 c0 -2 -.3 -4 -.9 -5.5 2.1 1 3.7 3 3.9 5.5 m-6.5 7 c-.4 -.2 -1.3 -1.8 -1.5 -5 h2.9 c-.2 3.2 -1 4.8 -1.4 5 M21 21 c.1 -3.8 1.1 -5.8 1.4 -6 .4 .2 1.4 2.2 1.5 6z m-1.1 -5.5 C19.3 17 19.1 19 19 21 h-3 c.2 -2.5 1.8 -4.5 3.9 -5.5 M16.2 23 H19 c.1 1.6 .4 3.2 .9 4.5 a6.7 6.7 0 0 1 -3.7 -4.5 m8.9 4.5 q.75 -1.95 .9 -4.5 h2.9 c-.6 2 -2 3.7 -3.8 4.5
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22.5 13
          moveTo(x = 22.5f, y = 13.0f)
          // a 8.5 8.5 0 1 0 -0.01 16.99
          arcToRelative(
            a = 8.5f,
            b = 8.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -0.01f,
            dy1 = 16.99f,
          )
          // A 8.5 8.5 0 0 0 22.5 13
          arcTo(
            horizontalEllipseRadius = 8.5f,
            verticalEllipseRadius = 8.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 22.5f,
            y1 = 13.0f,
          )
          // m 6.5 8
          moveToRelative(dx = 6.5f, dy = 8.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // c 0 -2 -0.3 -4 -0.9 -5.5
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -2.0f,
            dx2 = -0.3f,
            dy2 = -4.0f,
            dx3 = -0.9f,
            dy3 = -5.5f,
          )
          // c 2.1 1 3.7 3 3.9 5.5
          curveToRelative(
            dx1 = 2.1f,
            dy1 = 1.0f,
            dx2 = 3.7f,
            dy2 = 3.0f,
            dx3 = 3.9f,
            dy3 = 5.5f,
          )
          // m -6.5 7
          moveToRelative(dx = -6.5f, dy = 7.0f)
          // c -0.4 -0.2 -1.3 -1.8 -1.5 -5
          curveToRelative(
            dx1 = -0.4f,
            dy1 = -0.2f,
            dx2 = -1.3f,
            dy2 = -1.8f,
            dx3 = -1.5f,
            dy3 = -5.0f,
          )
          // h 2.9
          horizontalLineToRelative(dx = 2.9f)
          // c -0.2 3.2 -1 4.8 -1.4 5
          curveToRelative(
            dx1 = -0.2f,
            dy1 = 3.2f,
            dx2 = -1.0f,
            dy2 = 4.8f,
            dx3 = -1.4f,
            dy3 = 5.0f,
          )
          // M 21 21
          moveTo(x = 21.0f, y = 21.0f)
          // c 0.1 -3.8 1.1 -5.8 1.4 -6
          curveToRelative(
            dx1 = 0.1f,
            dy1 = -3.8f,
            dx2 = 1.1f,
            dy2 = -5.8f,
            dx3 = 1.4f,
            dy3 = -6.0f,
          )
          // c 0.4 0.2 1.4 2.2 1.5 6z
          curveToRelative(
            dx1 = 0.4f,
            dy1 = 0.2f,
            dx2 = 1.4f,
            dy2 = 2.2f,
            dx3 = 1.5f,
            dy3 = 6.0f,
          )
          close()
          // m -1.1 -5.5
          moveToRelative(dx = -1.1f, dy = -5.5f)
          // C 19.3 17 19.1 19 19 21
          curveTo(
            x1 = 19.3f,
            y1 = 17.0f,
            x2 = 19.1f,
            y2 = 19.0f,
            x3 = 19.0f,
            y3 = 21.0f,
          )
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // c 0.2 -2.5 1.8 -4.5 3.9 -5.5
          curveToRelative(
            dx1 = 0.2f,
            dy1 = -2.5f,
            dx2 = 1.8f,
            dy2 = -4.5f,
            dx3 = 3.9f,
            dy3 = -5.5f,
          )
          // M 16.2 23
          moveTo(x = 16.2f, y = 23.0f)
          // H 19
          horizontalLineTo(x = 19.0f)
          // c 0.1 1.6 0.4 3.2 0.9 4.5
          curveToRelative(
            dx1 = 0.1f,
            dy1 = 1.6f,
            dx2 = 0.4f,
            dy2 = 3.2f,
            dx3 = 0.9f,
            dy3 = 4.5f,
          )
          // a 6.7 6.7 0 0 1 -3.7 -4.5
          arcToRelative(
            a = 6.7f,
            b = 6.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.7f,
            dy1 = -4.5f,
          )
          // m 8.9 4.5
          moveToRelative(dx = 8.9f, dy = 4.5f)
          // q 0.75 -1.95 0.9 -4.5
          quadToRelative(
            dx1 = 0.75f,
            dy1 = -1.95f,
            dx2 = 0.9f,
            dy2 = -4.5f,
          )
          // h 2.9
          horizontalLineToRelative(dx = 2.9f)
          // c -0.6 2 -2 3.7 -3.8 4.5
          curveToRelative(
            dx1 = -0.6f,
            dy1 = 2.0f,
            dx2 = -2.0f,
            dy2 = 3.7f,
            dx3 = -3.8f,
            dy3 = 4.5f,
          )
        }
        // M25.8 10 a9.98 9.98 0 0 0 -19.6 .1 A7.6 7.6 0 0 0 0 17.5 C0 21.6 3.4 25 7.5 25 H11 v-2 H7.5 c-3 0 -5.5 -2.5 -5.5 -5.5 0 -2.9 2.2 -5.3 5.1 -5.5 H8 v-.9 c.5 -4 3.9 -7.1 8 -7.1 3.7 0 6.8 2.6 7.7 6z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25.8 10
          moveTo(x = 25.8f, y = 10.0f)
          // a 9.98 9.98 0 0 0 -19.6 0.1
          arcToRelative(
            a = 9.98f,
            b = 9.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -19.6f,
            dy1 = 0.1f,
          )
          // A 7.6 7.6 0 0 0 0 17.5
          arcTo(
            horizontalEllipseRadius = 7.6f,
            verticalEllipseRadius = 7.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 0.0f,
            y1 = 17.5f,
          )
          // C 0 21.6 3.4 25 7.5 25
          curveTo(
            x1 = 0.0f,
            y1 = 21.6f,
            x2 = 3.4f,
            y2 = 25.0f,
            x3 = 7.5f,
            y3 = 25.0f,
          )
          // H 11
          horizontalLineTo(x = 11.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 7.5
          horizontalLineTo(x = 7.5f)
          // c -3 0 -5.5 -2.5 -5.5 -5.5
          curveToRelative(
            dx1 = -3.0f,
            dy1 = 0.0f,
            dx2 = -5.5f,
            dy2 = -2.5f,
            dx3 = -5.5f,
            dy3 = -5.5f,
          )
          // c 0 -2.9 2.2 -5.3 5.1 -5.5
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -2.9f,
            dx2 = 2.2f,
            dy2 = -5.3f,
            dx3 = 5.1f,
            dy3 = -5.5f,
          )
          // H 8
          horizontalLineTo(x = 8.0f)
          // v -0.9
          verticalLineToRelative(dy = -0.9f)
          // c 0.5 -4 3.9 -7.1 8 -7.1
          curveToRelative(
            dx1 = 0.5f,
            dy1 = -4.0f,
            dx2 = 3.9f,
            dy2 = -7.1f,
            dx3 = 8.0f,
            dy3 = -7.1f,
          )
          // c 3.7 0 6.8 2.6 7.7 6z
          curveToRelative(
            dx1 = 3.7f,
            dy1 = 0.0f,
            dx2 = 6.8f,
            dy2 = 2.6f,
            dx3 = 7.7f,
            dy3 = 6.0f,
          )
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
      .also { _networkPublic = it }
  }

@Suppress("ObjectPropertyName")
private var _networkPublic: ImageVector? = null
