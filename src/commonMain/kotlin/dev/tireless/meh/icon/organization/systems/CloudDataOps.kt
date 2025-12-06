// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudDataOps: ImageVector
  get() {
    val current = _cloudDataOps
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CloudDataOps",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="10" x="28.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 18
          moveTo(x = 28.0f, y = 18.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="14" x="24.0" y="14.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 14
          moveTo(x = 24.0f, y = 14.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="6" x="20.0" y="22.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 22
          moveTo(x = 20.0f, y = 22.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // m22.18 10 1.58 -1.27 a10 10 0 0 0 -5.87 -3.55 10 10 0 0 0 -11.72 7.94 7.5 7.5 0 0 0 -6.12 8.29 A7.7 7.7 0 0 0 7.77 28 H16 v-2 H7.7 a5.6 5.6 0 0 1 -5.6 -4.49 5.5 5.5 0 0 1 4.43 -6.43 l1.34 -.24 .22 -1.11 a8.2 8.2 0 0 1 6.74 -6.64 8 8 0 0 1 3.01 .13 A7.8 7.8 0 0 1 22.18 10
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22.18 10
          moveTo(x = 22.18f, y = 10.0f)
          // l 1.58 -1.27
          lineToRelative(dx = 1.58f, dy = -1.27f)
          // a 10 10 0 0 0 -5.87 -3.55
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.87f,
            dy1 = -3.55f,
          )
          // a 10 10 0 0 0 -11.72 7.94
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -11.72f,
            dy1 = 7.94f,
          )
          // a 7.5 7.5 0 0 0 -6.12 8.29
          arcToRelative(
            a = 7.5f,
            b = 7.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.12f,
            dy1 = 8.29f,
          )
          // A 7.7 7.7 0 0 0 7.77 28
          arcTo(
            horizontalEllipseRadius = 7.7f,
            verticalEllipseRadius = 7.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.77f,
            y1 = 28.0f,
          )
          // H 16
          horizontalLineTo(x = 16.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 7.7
          horizontalLineTo(x = 7.7f)
          // a 5.6 5.6 0 0 1 -5.6 -4.49
          arcToRelative(
            a = 5.6f,
            b = 5.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.6f,
            dy1 = -4.49f,
          )
          // a 5.5 5.5 0 0 1 4.43 -6.43
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.43f,
            dy1 = -6.43f,
          )
          // l 1.34 -0.24
          lineToRelative(dx = 1.34f, dy = -0.24f)
          // l 0.22 -1.11
          lineToRelative(dx = 0.22f, dy = -1.11f)
          // a 8.2 8.2 0 0 1 6.74 -6.64
          arcToRelative(
            a = 8.2f,
            b = 8.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 6.74f,
            dy1 = -6.64f,
          )
          // a 8 8 0 0 1 3.01 0.13
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.01f,
            dy1 = 0.13f,
          )
          // A 7.8 7.8 0 0 1 22.18 10
          arcTo(
            horizontalEllipseRadius = 7.8f,
            verticalEllipseRadius = 7.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 22.18f,
            y1 = 10.0f,
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
      .also { _cloudDataOps = it }
  }

@Suppress("ObjectPropertyName")
private var _cloudDataOps: ImageVector? = null
