// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DocumentAudio: ImageVector
  get() {
    val current = _documentAudio
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DocumentAudio",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29 31 a1 1 0 0 1 -.62 -.22 L23.65 27 H20 a1 1 0 0 1 -1 -1 v-5 a1 1 0 0 1 1 -1 h3.65 l4.73 -3.78 A1 1 0 0 1 30 17 v13 a1 1 0 0 1 -1 1 m-8 -6 h3 a1 1 0 0 1 .62 .22 l3.38 2.7 v-8.84 l-3.38 2.7 A1 1 0 0 1 24 22 h-3Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29 31
          moveTo(x = 29.0f, y = 31.0f)
          // a 1 1 0 0 1 -0.62 -0.22
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.62f,
            dy1 = -0.22f,
          )
          // L 23.65 27
          lineTo(x = 23.65f, y = 27.0f)
          // H 20
          horizontalLineTo(x = 20.0f)
          // a 1 1 0 0 1 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // a 1 1 0 0 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // h 3.65
          horizontalLineToRelative(dx = 3.65f)
          // l 4.73 -3.78
          lineToRelative(dx = 4.73f, dy = -3.78f)
          // A 1 1 0 0 1 30 17
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 30.0f,
            y1 = 17.0f,
          )
          // v 13
          verticalLineToRelative(dy = 13.0f)
          // a 1 1 0 0 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // m -8 -6
          moveToRelative(dx = -8.0f, dy = -6.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // a 1 1 0 0 1 0.62 0.22
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.62f,
            dy1 = 0.22f,
          )
          // l 3.38 2.7
          lineToRelative(dx = 3.38f, dy = 2.7f)
          // v -8.84
          verticalLineToRelative(dy = -8.84f)
          // l -3.38 2.7
          lineToRelative(dx = -3.38f, dy = 2.7f)
          // A 1 1 0 0 1 24 22
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 24.0f,
            y1 = 22.0f,
          )
          // h -3z
          horizontalLineToRelative(dx = -3.0f)
          close()
        }
        // M16 28 H8 V4 h8 v6 a2 2 0 0 0 2 2 h6 v3 h2 v-5 a1 1 0 0 0 -.3 -.7 l-7 -7 A1 1 0 0 0 18 2 H8 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h8Z m2 -23.6 5.6 5.6 H18Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 28
          moveTo(x = 16.0f, y = 28.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // a 1 1 0 0 0 -0.3 -0.7
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.3f,
            dy1 = -0.7f,
          )
          // l -7 -7
          lineToRelative(dx = -7.0f, dy = -7.0f)
          // A 1 1 0 0 0 18 2
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 18.0f,
            y1 = 2.0f,
          )
          // H 8
          horizontalLineTo(x = 8.0f)
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
          // v 24
          verticalLineToRelative(dy = 24.0f)
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
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
          close()
          // m 2 -23.6
          moveToRelative(dx = 2.0f, dy = -23.6f)
          // l 5.6 5.6
          lineToRelative(dx = 5.6f, dy = 5.6f)
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
      .also { _documentAudio = it }
  }

@Suppress("ObjectPropertyName")
private var _documentAudio: ImageVector? = null
