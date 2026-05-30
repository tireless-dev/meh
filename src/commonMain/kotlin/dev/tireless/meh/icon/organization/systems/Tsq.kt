// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tsq: ImageVector
  get() {
    val current = _tsq
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Tsq",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="11" height="2" x="19.0" y="26.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 26
          moveTo(x = 19.0f, y = 26.0f)
          // h 11
          horizontalLineToRelative(dx = 11.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -11z
          horizontalLineToRelative(dx = -11.0f)
          close()
        }
        // <rect width="11" height="2" x="19.0" y="22.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 22
          moveTo(x = 19.0f, y = 22.0f)
          // h 11
          horizontalLineToRelative(dx = 11.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -11z
          horizontalLineToRelative(dx = -11.0f)
          close()
        }
        // M30 20 H19 v-8 h11z m-9 -2 h7 v-4 h-7z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 20
          moveTo(x = 30.0f, y = 20.0f)
          // H 19
          horizontalLineTo(x = 19.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 11z
          horizontalLineToRelative(dx = 11.0f)
          close()
          // m -9 -2
          moveToRelative(dx = -9.0f, dy = -2.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h -7z
          horizontalLineToRelative(dx = -7.0f)
          close()
        }
        // <rect width="11" height="2" x="19.0" y="8.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 8
          moveTo(x = 19.0f, y = 8.0f)
          // h 11
          horizontalLineToRelative(dx = 11.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -11z
          horizontalLineToRelative(dx = -11.0f)
          close()
        }
        // <rect width="11" height="2" x="19.0" y="4.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 4
          moveTo(x = 19.0f, y = 4.0f)
          // h 11
          horizontalLineToRelative(dx = 11.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -11z
          horizontalLineToRelative(dx = -11.0f)
          close()
        }
        // <polygon points="10.293 18.707 8.0 16.4143 8.0 12.0 10.0 12.0 10.0 15.5857 11.707 17.293 10.293 18.707" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10.293 18.707
          moveTo(x = 10.293f, y = 18.707f)
          // L 8 16.4143
          lineTo(x = 8.0f, y = 16.4143f)
          // L 8 12
          lineTo(x = 8.0f, y = 12.0f)
          // L 10 12
          lineTo(x = 10.0f, y = 12.0f)
          // L 10 15.5857
          lineTo(x = 10.0f, y = 15.5857f)
          // L 11.707 17.293
          lineTo(x = 11.707f, y = 17.293f)
          // L 10.293 18.707z
          lineTo(x = 10.293f, y = 18.707f)
          close()
        }
        // M9 24 A8 8 0 0 1 9 8 a8 8 0 0 1 0 16 m0 -14 a6.01 6.01 0 1 0 6 6 6 6 0 0 0 -6 -6
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 24
          moveTo(x = 9.0f, y = 24.0f)
          // A 8 8 0 0 1 9 8
          arcTo(
            horizontalEllipseRadius = 8.0f,
            verticalEllipseRadius = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 9.0f,
            y1 = 8.0f,
          )
          // a 8 8 0 0 1 0 16
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 16.0f,
          )
          // m 0 -14
          moveToRelative(dx = 0.0f, dy = -14.0f)
          // a 6.01 6.01 0 1 0 6 6
          arcToRelative(
            a = 6.01f,
            b = 6.01f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 6.0f,
            dy1 = 6.0f,
          )
          // a 6 6 0 0 0 -6 -6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.0f,
            dy1 = -6.0f,
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
      .also { _tsq = it }
  }

@Suppress("ObjectPropertyName")
private var _tsq: ImageVector? = null
