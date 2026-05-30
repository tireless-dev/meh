// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DocumentPdf: ImageVector
  get() {
    val current = _documentPdf
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DocumentPdf",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="30.0 18.0 30.0 16.0 24.0 16.0 24.0 26.0 26.0 26.0 26.0 22.0 29.0 22.0 29.0 20.0 26.0 20.0 26.0 18.0 30.0 18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 18
          moveTo(x = 30.0f, y = 18.0f)
          // L 30 16
          lineTo(x = 30.0f, y = 16.0f)
          // L 24 16
          lineTo(x = 24.0f, y = 16.0f)
          // L 24 26
          lineTo(x = 24.0f, y = 26.0f)
          // L 26 26
          lineTo(x = 26.0f, y = 26.0f)
          // L 26 22
          lineTo(x = 26.0f, y = 22.0f)
          // L 29 22
          lineTo(x = 29.0f, y = 22.0f)
          // L 29 20
          lineTo(x = 29.0f, y = 20.0f)
          // L 26 20
          lineTo(x = 26.0f, y = 20.0f)
          // L 26 18
          lineTo(x = 26.0f, y = 18.0f)
          // L 30 18z
          lineTo(x = 30.0f, y = 18.0f)
          close()
        }
        // M19 26 h-4 V16 h4 a3 3 0 0 1 3 3 v4 a3 3 0 0 1 -3 3 m-2 -2 h2 a1 1 0 0 0 1 -1 v-4 a1 1 0 0 0 -1 -1 h-2Z m-6 -8 H6 v10 h2 v-3 h3 a2 2 0 0 0 2 -2 v-3 a2 2 0 0 0 -2 -2 m-3 5 v-3 h3 v3Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 26
          moveTo(x = 19.0f, y = 26.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 16
          verticalLineTo(y = 16.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // a 3 3 0 0 1 3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = 3.0f,
          )
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // a 3 3 0 0 1 -3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 3.0f,
          )
          // m -2 -2
          moveToRelative(dx = -2.0f, dy = -2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 1 1 0 0 0 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
          // m -6 -8
          moveToRelative(dx = -6.0f, dy = -8.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
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
          // v -3
          verticalLineToRelative(dy = -3.0f)
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
          // m -3 5
          moveToRelative(dx = -3.0f, dy = 5.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 3z
          verticalLineToRelative(dy = 3.0f)
          close()
        }
        // M22 14 v-4 a1 1 0 0 0 -.3 -.7 l-7 -7 A1 1 0 0 0 14 2 H4 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h16 v-2 H4 V4 h8 v6 a2 2 0 0 0 2 2 h6 v2Z m-8 -4 V4.4 l5.6 5.6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 14
          moveTo(x = 22.0f, y = 14.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
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
          // A 1 1 0 0 0 14 2
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 14.0f,
            y1 = 2.0f,
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
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
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
          // v 2z
          verticalLineToRelative(dy = 2.0f)
          close()
          // m -8 -4
          moveToRelative(dx = -8.0f, dy = -4.0f)
          // V 4.4
          verticalLineTo(y = 4.4f)
          // l 5.6 5.6z
          lineToRelative(dx = 5.6f, dy = 5.6f)
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
      .also { _documentPdf = it }
  }

@Suppress("ObjectPropertyName")
private var _documentPdf: ImageVector? = null
