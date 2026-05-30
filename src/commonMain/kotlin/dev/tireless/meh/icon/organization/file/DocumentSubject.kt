// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DocumentSubject: ImageVector
  get() {
    val current = _documentSubject
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DocumentSubject",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 30 h-5 v-2 h5 v-2 h-3 a2 2 0 0 1 -2 -2 v-2 a2 2 0 0 1 2 -2 h5 v2 h-5 v2 h3 a2 2 0 0 1 2 2 v2 a2 2 0 0 1 -2 2
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 30
          moveTo(x = 26.0f, y = 30.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // v -2
          verticalLineToRelative(dy = -2.0f)
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
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
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
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
        }
        // <rect width="6" height="2" x="10.0" y="20.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 10 20
          moveTo(x = 10.0f, y = 20.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
        }
        // <rect width="8" height="2" x="10.0" y="16.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 10 16
          moveTo(x = 10.0f, y = 16.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
        }
        // M24 17 h2 v-7 c0 -.1 0 -.3 -.1 -.4 s-.1 -.2 -.2 -.3 l-7 -7 c-.1 -.1 -.2 -.2 -.3 -.2 C18.3 2 18.1 2 18 2 H8 C7.5 2 7 2.2 6.6 2.6 A2 2 0 0 0 6 4 v24 c0 .5 .2 1 .6 1.4 S7.5 30 8 30 h7.95 v-2 H8 V4 h8 v6 c0 .5 .2 1 .6 1.4 S17.5 12 18 12 h6z m-6 -7 V4.4 l5.6 5.6z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 17
          moveTo(x = 24.0f, y = 17.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // c 0 -0.1 0 -0.3 -0.1 -0.4
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.1f,
            dx2 = 0.0f,
            dy2 = -0.3f,
            dx3 = -0.1f,
            dy3 = -0.4f,
          )
          // s -0.1 -0.2 -0.2 -0.3
          reflectiveCurveToRelative(
            dx1 = -0.1f,
            dy1 = -0.2f,
            dx2 = -0.2f,
            dy2 = -0.3f,
          )
          // l -7 -7
          lineToRelative(dx = -7.0f, dy = -7.0f)
          // c -0.1 -0.1 -0.2 -0.2 -0.3 -0.2
          curveToRelative(
            dx1 = -0.1f,
            dy1 = -0.1f,
            dx2 = -0.2f,
            dy2 = -0.2f,
            dx3 = -0.3f,
            dy3 = -0.2f,
          )
          // C 18.3 2 18.1 2 18 2
          curveTo(
            x1 = 18.3f,
            y1 = 2.0f,
            x2 = 18.1f,
            y2 = 2.0f,
            x3 = 18.0f,
            y3 = 2.0f,
          )
          // H 8
          horizontalLineTo(x = 8.0f)
          // C 7.5 2 7 2.2 6.6 2.6
          curveTo(
            x1 = 7.5f,
            y1 = 2.0f,
            x2 = 7.0f,
            y2 = 2.2f,
            x3 = 6.6f,
            y3 = 2.6f,
          )
          // A 2 2 0 0 0 6 4
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.0f,
            y1 = 4.0f,
          )
          // v 24
          verticalLineToRelative(dy = 24.0f)
          // c 0 0.5 0.2 1 0.6 1.4
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.5f,
            dx2 = 0.2f,
            dy2 = 1.0f,
            dx3 = 0.6f,
            dy3 = 1.4f,
          )
          // S 7.5 30 8 30
          reflectiveCurveTo(
            x1 = 7.5f,
            y1 = 30.0f,
            x2 = 8.0f,
            y2 = 30.0f,
          )
          // h 7.95
          horizontalLineToRelative(dx = 7.95f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // c 0 0.5 0.2 1 0.6 1.4
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.5f,
            dx2 = 0.2f,
            dy2 = 1.0f,
            dx3 = 0.6f,
            dy3 = 1.4f,
          )
          // S 17.5 12 18 12
          reflectiveCurveTo(
            x1 = 17.5f,
            y1 = 12.0f,
            x2 = 18.0f,
            y2 = 12.0f,
          )
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
          close()
          // m -6 -7
          moveToRelative(dx = -6.0f, dy = -7.0f)
          // V 4.4
          verticalLineTo(y = 4.4f)
          // l 5.6 5.6z
          lineToRelative(dx = 5.6f, dy = 5.6f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
        path(
          fill = SolidColor(Color.Transparent),
          strokeLineWidth = 0.0f,
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
      .also { _documentSubject = it }
  }

@Suppress("ObjectPropertyName")
private var _documentSubject: ImageVector? = null
